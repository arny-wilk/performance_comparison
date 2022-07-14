function bubbleSort(array) {
    for (let i = 0; i < array.length - 1; i++){
        for (let j = 0; j < array.length - 1 - i; j++){
            if (array[j] > array[j+1]){
                [array[j], array[j+1]] = [array[j+1], array[j]];
            }
        }
    }
    return array;
}

let fs = require('fs');
let text = fs.readFileSync("./numbers.txt", "utf8");
let textByLine = text.split(",");
start1 = new Date().getTime();
console.log(bubbleSort(textByLine));
end1 = new Date().getTime();
console.log("Elapsed time: " + (end1 - start1) + "ms")