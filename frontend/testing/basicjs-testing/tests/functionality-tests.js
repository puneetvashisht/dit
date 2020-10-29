//JASMINE OR (JUNIT) library code  --- KARMA is a test runner

describe("Testing functionality...", function() {
    var a;
  
    it("and so is a spec", function() {
      a = true;
      expect(a).toBe(true);
    });

    it("3 + 2 = 5", function(){
        oper1 = 3;
        oper2 = 2
        var result = add(oper1, oper2);
        expect(result).toBe(5)
    })

    it("-3 + -2 = 5", function(){
        oper1 = -3;
        oper2 = -2
        var result = add(oper1, oper2);
        expect(result).toBe(-5)
    })


  });
      