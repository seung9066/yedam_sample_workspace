console.log('----- object1.js -----')

class Estimate {
    constructor(param) {
        this.unit = param;
    }
    getEstimate(unitType, width, height) {
        let priceInfo = this.unit.find(function (val) {
            return val.type == unitType;
        })
        return priceInfo.price * width * height;
    }
    addUnit(unit) {
        this.unit.push(unit);
    }
}

let unitInfo = [{
        type: 'wood',
        price: 100
    },
    {
        type: 'iron',
        price: 300
    },
    {
        type: 'plastic',
        price: 200
    }
]

let estmate = new Estimate(unitInfo);
let resultt = estmate.getEstimate('wood', 30, 50);

estmate.addUnit({type: 'ceramic', price: 400});
resultt = estmate.getEstimate('ceramic', 10, 20);

console.log(estmate.unit);
console.log(`계산값은 ${resultt}`);