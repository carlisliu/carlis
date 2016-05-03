"use strict";

var tableNames = ['advertising',
    'base_admin_scenic_sopt_rela',
    'base_admin_token',
    'base_adminuserinfo',
    'base_roleright',
    'base_roles',
    'base_sysloginlog',
    'base_sysmenu',
    'base_user_scenicspot',
    'base_userright',
    'base_userrole',
    'city',
    'city_extend',
    'city_images',
    'city_special_recommendation',
    'county',
    'county_images',
    'dishes',
    'dishes_images',
    'entertainment',
    'entertainment_images',
    'hotel',
    'hotel_service',
    'hotel_service_images',
    'journey_base_info',
    'journey_info',
    'landscape',
    'landscape_images',
    'landscape_type',
    'region',
    'restaurant',
    'scenic_spot',
    'scenic_spot_activity',
    'scenic_spot_comments',
    'scenic_spot_extend',
    'scenic_spot_feedback',
    'scenic_spot_hotel_rela',
    'scenic_spot_images',
    'scenic_spot_live',
    'scenic_spot_points',
    'scenic_spot_restaurant_rela',
    'scenic_spot_sos',
    'scenic_spot_ticket',
    'scenic_spot_user_images',
    'search_index',
    'special_recommendation',
    'swim_together',
    'swim_together_route',
    'traffic_extend',
    'travel_strategy_base',
    'travel_strategy_trip',
    'user_photo_album',
    'user_photo_album_images',
    'users',
    'users_info',
    'users_scenic_spot_trajectory',
    'users_token'
];

function fcamelCase(all, letter) {
    return letter.toUpperCase();
}

function table2Entity(tables) {
    var result = [];
    tables.forEach(function(table) {
        var entity = table.replace(/_([\da-z])/gi, fcamelCase);
        result.push(entity.charAt(0).toUpperCase() + entity.substr(1));
    });
    result result;
}

var template = `
<table tableName="advertising" domainObjectName="${table}"
               enableCountByExample="false" enableUpdateByExample="false"
               enableDeleteByExample="false" enableSelectByExample="false"
               selectByExampleQueryId="false">
        </table>
`;

function config() {
    
}

var content = "";

