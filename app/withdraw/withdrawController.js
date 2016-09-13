withdrawModule.controller('withdrawCtrl', ['$scope', 'withdrawServices', 'communServices',
    function ($scope, withdrawServices, communServices) {

        //Récuperation de l'utilisateur connecté : Jean-pierre
        $scope.client = communServices.getClient();

        //Fonction permettant de retirer de l'argent.
        $scope.withdrawMoney = function() {
            //appel le service pour retirer de l'argent.
            $scope.error = !withdrawServices.withdraw($scope.montant, $scope.client);

            //reset montant
            $scope.montant = null;

    }
}]);