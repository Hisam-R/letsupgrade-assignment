<?php
// Function to print the multiplication table
function printMultiplicationTable($number) {
    for ($i = 1; $i <= 10; $i++) {
        $result = $number * $i;
        echo $number . " x " . $i . " = " . $result . "\n";
    }
}

// Test the function with a given number
$givenNumber = 7;
printMultiplicationTable($givenNumber);
?>
