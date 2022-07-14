<?php
// PHP Optimized implementation
// of Bubble sort
 
// An optimized version of Bubble Sort
function bubbleSort(&$arr)
{
    //$items = array($arr);
    $n = sizeof($arr);
 
    // Traverse through all array elements
    for($i = 0; $i < $n; $i++)
    {
        $swapped = False;
 
        // Last i elements are already
        // in place
        for ($j = 0; $j < $n - $i - 1; $j++)
        {
             
            // traverse the array from 0 to
            // n-i-1. Swap if the element
            // found is greater than the
            // next element
            if ($arr[$j] > $arr[$j+1])
            {
                $temp = $arr[$j];
                $arr[$j] = $arr[$j+1];
                $arr[$j+1] = $temp;
                $swapped = True;
            }
        }
 
        // IF no two elements were swapped
        // by inner loop, then break
        if ($swapped == False)
            break;
    }
}

// Driver code to test above
$lines = file('numbers.txt', FILE_IGNORE_NEW_LINES);

$array = explode(",", file_get_contents('numbers.txt'));


$start = microtime(true);
bubbleSort($array);
echo print_r($array);
$end = microtime(true);

echo "Elapsed Time in milli seconds: ".(($end - $start)*1000)."ms";

     
// This code is contributed by ChitraNayal.
?>
