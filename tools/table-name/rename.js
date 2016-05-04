var path = require("path");
var fs = require("fs");
var args = process.argv.splice(2);
var rootPath = args && args[0];

if (rootPath) {
    renameFilesInDir(path.resolve(rootPath));
} else {
    renameFilesInDir(path.dirname(__filename));
}


function changeFileName(filepath){
    fs.stat(filepath, function(err,stats){
        if(stats.isFile()){
            var fileName = path.basename(filepath);
            if (fit(fileName)) {
                var _newName = newFileName(fileName);
                var parentDir =path.dirname(filepath);
                var newPath = path.resolve(parentDir, _newName);
                fs.rename(filepath,newPath);    
            } else {
                return console.log("ignore file: %s", fileName);
            }
        } else if (stats.isDirectory()){
            console.log("============%s isDir===========", filepath);
            renameFilesInDir(filepath);
        } else {
            console.log("ignore file: %s", filename);
        }
    });
}

function fit (fileName) {
    return fileName && /mapper.xml$/i.test(fileName);
}

function newFileName (fileName) {
    fileName = fileName.charAt(0).toLowerCase() + fileName.substr(1);
    return fileName.replace(/([A-Z])/g, function  (all, letter) {
        return '-' + letter.toLowerCase();
    });
}

function renameFilesInDir(dir){
    fs.readdir(dir, function(error, files){
        if (files && files.length) {
            files.forEach(function  (file) {
                changeFileName(path.resolve(dir, file));
            });
        }
    });
}