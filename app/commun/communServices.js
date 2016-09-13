angular.module('core', ['ngRoute']);
angular.module('core').service('communServices', function() {

    /**
     * Methode permettant de boucher la récuperation de l'utilisateur connecté
     */

    var client = {id:1, nom:'jean-pierre', solde:100};
    this.getClient = function() {
       //Bouchon pour récupérer l'utilisateur supposé loggué : jean-pierre
        return client;


    }

    /**
     * Methode permettant de bouchonner le solde de l'utilisateur connecté
     */
    this.getClientSolde = function() {
        //Bouchon pour récupérer l'utilisateur supposé loggué : jean-pierre
        return client.solde;


    }


});