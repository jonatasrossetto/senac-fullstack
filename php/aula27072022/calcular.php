<?php

$valorA = $_POST['a'];
echo"a: ".$valorA."<br>";
$valorB = $_POST['b'];
echo"b: ".$valorB."<br>";
$operation = $_POST['op'];
echo"operação: ".$operation."<br>";
echo"<br>";
if (is_numeric($valorA) and is_numeric($valorB)) 
{
    switch ($operation) {
        case 'add':
            echo"A + B = ".($valorA+$valorB)."<br>";
            break;
        case 'subtract':
            echo"A + B = ".($valorA+$valorB)."<br>";
            break;
        case 'subtract':
            echo"A - B = ".($valorA-$valorB)."<br>";
            break;
        case 'multiply':
            echo"A * B = ".($valorA*$valorB)."<br>";
            break;
        case 'divide':
            if ($valorB==0) {
                echo"A / B = not a number <br>";
            } else {
                echo"A / B = ".($valorA/$valorB)."<br>";
            }
            break;
    default:
            echo"deu ruim!! <br>";
            break;
    }
    
    
    echo"<br><br><br><br>";
    echo"A + B = ".($valorA+$valorB)."<br>";
    echo"A - B = ".($valorA-$valorB)."<br>";
    echo"A * B = ".($valorA*$valorB)."<br>";
    if ($valorB==0) {
        echo"A / B = not a number <br>";
    } else {
        echo"A / B = ".($valorA/$valorB)."<br>";
    }
    
} else {
        echo"um dos valores não é numérico";
    }


?>