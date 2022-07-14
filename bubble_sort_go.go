package main

import (
    "fmt"
 	"io/ioutil"
 	"os"
 	"strings"
    "time"
)

// read line by line into memory
// all file contents is stores in lines[]
 
func bubblesort(items []string) {
    var (
        n = len(items)
        sorted = false
    )
    for !sorted {
        swapped := false
        for i := 0; i < n-1; i++ {
            if items[i] > items[i+1] {
                items[i+1], items[i] = items[i], items[i+1]
                swapped = true
            }
        }
        if !swapped {
            sorted = true
        }
        n = n - 1
    }
}

func main() {


    start := time.Now()

    bubblesort(sliceData)
 
    duration := time.Since(start)
    fmt.Println(duration)


}

