describe('Withdraw Services Tests Suite', function() {


    var withdrawServices;

    var client = {
        id : 1,
        nom : 'jean-pierre',
        solde : 100
    }

    beforeEach(module('withdrawModule'));

   //Initialisation du service de withdraw.
   beforeEach(inject(function(_withdrawServices_) {
        withdrawServices = _withdrawServices_;
    }));



    //Vérification de l'initialisation du service.
    it('withdrawServices exist', function() {
        expect(withdrawServices).toBeDefined();
    });

    //Test lié a la methode withdraw
    describe('.withdraw()', function() {
        it("Retrait accepte", function () {
            expect(withdrawServices.withdraw(100,client));
        });
		
		it("Retrait Solde OK", function () {
            withdrawServices.withdraw(10,client);
            expect(client.solde == 90);
        });

        it("Montant non renseigne", function () {
            expect(!withdrawServices.withdraw(client));
        });

        it("Montant superieur au solde", function () {
            expect(!withdrawServices.withdraw(105, client));
        });
    });


});