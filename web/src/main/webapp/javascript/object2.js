console.log('----- object2.js -----')

function Estimate_(param) {
    this.unit = param;
    this.getEstimate_ = function(unitType, width, height) {
        let priceInfo_ = this.unit.find(val => val.type == unitType);
        return priceInfo_.price * width * height;
    }
    this.addUnit = function(unit) {
        this.unit.push(unit);
    }
}

let unitInfo_ = [{
        type: 'wood',
        price: 100
    },
    {
        type: 'iron',
        price: 300
    }, {
        type: 'plastic',
        price: 200
    }
];

let estimate_ = new Estimate_(unitInfo_);
let result_ = estimate_.getEstimate_('iron', 20, 30);
console.log(`가격: ${result_}`)
estimate_.addUnit({type: 'carbon', price: 500});;
result_ = estimate_.getEstimate_('carbon', 20, 30);
console.log(`가격: ${result_}`)