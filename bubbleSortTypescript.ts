const bubbleSort1 = (arr: number[]): number[] => {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j + 1]) {
                arr[j], arr[j + 1] = arr[j + 1], arr[j];
            }
        }
    }
    return arr;
}

let start1 = new Date().getTime();
let fs = require("fs");
let text = fs.readFileSync("./numbers.txt", 'utf-8');
let textByLine = text.split(',')
console.log(bubbleSort1(textByLine));
let end1 = new Date().getTime();
console.log("Elapsed time: " + (end1 - start1) + " ms");
