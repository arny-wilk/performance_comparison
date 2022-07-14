/* Optimized javaScript implementation of
Bubble sort
An optimized version of Bubble Sort */

function bubbleSort(arr, n)
	{
		var i, j, temp;
		var swapped;
		for (i = 0; i < n - 1; i++)
		{
			swapped = false;
			for (j = 0; j < n - i - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	// Function to print an array
	function printArray(arr, size)
	{
		let i;
		for (i = 0; i < size; i++)
			console.log(arr[i] + " ");
		console.log();
	}

	// Driver program
		let arr = [1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92];
		let n = 10000;
		start = new Date().getTime();
		bubbleSort(arr, n);
		end = new Date().getTime();
		console.log("Elapsed time: " + (end - start) + "ms");

