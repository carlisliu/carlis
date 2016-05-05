"use strict";
var fs = require('fs');
var path = require('path');
var tableNames = require('./tables');

function fcamelCase(all, letter) {
    return letter.toUpperCase();
}

function table2Entity(tables) {
    var result = {};
    tables.forEach(function(table) {
        var entity = table.replace(/_([\da-z])/gi, fcamelCase);
        var name = entity.charAt(0).toUpperCase() + entity.substr(1);
        result[table] = name;
    });
    return result;
}

function compose() {
    var tables = table2Entity(tableNames);
    var content = '';
    for(var name in tables) {
    	content += render(name, tables[name]);
    }
    return content;
}

function render(tableName, entityName) {
	var template = `<table tableName="${tableName}" domainObjectName="${entityName}"
	       enableCountByExample="false" enableUpdateByExample="false"
	       enableDeleteByExample="false" enableSelectByExample="false"
	       selectByExampleQueryId="false">
	</table>
	`;
	return template;
}

var xmlContent = compose();
if (xmlContent) {
    fs.writeFile(path.resolve(__dirname, 'table-xml.txt'), xmlContent, function  (error) {
        if (error) {
            console.log(error);
        }
    });
}