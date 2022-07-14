package main

import (
	"time"
	"math/rand"
	"fmt"
)

func bubble_sort(mylist []int){
	n := 10000
	swapped := true

	for swapped {
		swapped = false

		for i := 1; i < n; i++ {
			if mylist[i-1] > mylist[i] {
				mylist[i-1], mylist[i] = mylist[i], mylist[i-1]
				swapped = true
			}
		}
	}
}

func main() {
	
	var mylist []int 

	for i:=0; i < 10000; i++ {
		mylist = append(mylist, rand.Intn(100))
	}

	start := time.Now()
	bubble_sort(mylist)
	duration := time.Since(start)

	fmt.Println(duration)
}
