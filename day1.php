<?php 

    function findgreatestnumber($num1, $num2, $num3){
        $greatest = $num1; //assume the first number is greatest

        if($num2 > $num1){
            $greatest = $num2;
        }
        if($num3 > $greatest){
            $greatest = $num3;
        }

        return $greatest;
    }

    $number1 = 10;//$_POST["Enter the number 1"];
    $number2 = 15;//$_POST["Enter the number 2"];
    $number3 = 35;//$_POST["Enter the number 3"];

    $greatestnumber = findgreatestnumber($number1, $number2, $number3);

    echo "The greatest number is :". $greatestnumber;
?>

