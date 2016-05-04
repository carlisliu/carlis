"use strict";
var fs = require('fs');
var path = require('path');
var tableNames = require('./tables');

function fcamelCase(all, letter) {
    return letter.toUpperCase();
}

function table2Entity(tables) {
    var result = [];
    tables.forEach(function(table) {
        var entity = table.replace(/_([\da-z])/gi, fcamelCase);
        result.push(entity.charAt(0).toUpperCase() + entity.substr(1));
    });
    return result;
}

function compose() {
    var tables = table2Entity(tableNames);
    var content = '';
    tables.forEach(function  (table) {
        var template = `<table tableName="advertising" domainObjectName="${table}"
       enableCountByExample="false" enableUpdateByExample="false"
       enableDeleteByExample="false" enableSelectByExample="false"
       selectByExampleQueryId="false">
</table>
`;
        content += template;
    })
    return content;
}

var xmlContent = compose();
if (xmlContent) {
    fs.writeFile(path.resolve(__dirname, 'table-xml.txt'), xmlContent, function  (error) {
        if (error) {
            console.log(error);
        }
    });
}