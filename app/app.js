'use strict';
var bankApp = angular.module('bankApp', ['ngRoute','core','withdrawModule']);

bankApp.config(['$locationProvider', '$routeProvider',
    function config($locationProvider, $routeProvider) {
        $locationProvider.hashPrefix('!');

        $routeProvider.
        when('/', {
            templateUrl: 'withdraw/html/withdraw.html',
            controller: 'withdrawCtrl'
        }).
        otherwise('/');
    }
]);