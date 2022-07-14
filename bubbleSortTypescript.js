var bubbleSort1 = function (arr) {
    for (var i = 0; i < arr.length; i++) {
        for (var j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j + 1]) {
                arr[j], arr[j + 1] = arr[j + 1], arr[j];
            }
        }
    }
    return arr;
};
var start1 = new Date().getTime();
var fs = require("fs");
var text = fs.readFileSync("./numbers.txt", 'utf-8');
var textByLine = text.split(',');
console.log(bubbleSort1(textByLine));
var end1 = new Date().getTime();
console.log("Elapsed time: " + (end1 - start1) + " ms");
