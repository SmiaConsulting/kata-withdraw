withdrawModule.service('withdrawServices', function() {

    /**
     * Methode permettant de retirer de l'argent du compte.
     */
    this.withdraw = function(montant, utilisateur) {
       
       //Vérification des paramètres.
         if(this.withdrawControles(montant, utilisateur)) {
             //appel du service REST POST /withdraw.
             utilisateur.solde = utilisateur.solde - montant;
             return true;

         } else {
             //TODO throw exception pour gerer différent message ou retourner un objet message à afficher ?

             return false;
         }


    }

    /**
     * Methode permettant de controler si le retrait est possible.
     * @param montant
     * @param utilisateur
     * @returns {boolean}
     */
    this.withdrawControles = function(montant, utilisateur) {

        //Controle si le montant a été renseigné et si c'est un nombre
        if(montant == null || isNaN(montant) ) {
            return false;
        }
            //Controle si le montant est inférieur ou égal au solde
        else if(montant > utilisateur.solde) {
            return false;
        }
        return true;
    }
});