<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teste de PHP</title>

<style>
        h1 {
            color: red;
        }
    </style>

</head>
<body>


    <?php

    $x=21;
    $y=2;
    echo"<h1>Operações Matemáticas em PHP</h1><br>";
    echo"x: ".$x."<br>";
    echo"y: ".$y."<br>";
    echo"soma: ".$x+$y."<br>";
    echo"subtração: ".$x-$y."<br>";
    echo"multiplicação: ".$x*$y."<br>";
    echo"divisão: ".$x/$y."<br>";
    echo"potenciação: ".$x**$y."<br>";
    echo"módulo: ".$x%$y."<br>";
    if ($x>$y) {
        echo"x é maior que y <br>";
    } else {
        echo"y é maior que x <br>";
    }

    echo"<br><br>";
    $idade=61;
    if ($idade>=60) {
            echo"você está na terceira idade <br>";
        } elseif ($idade>=18 && $idade<60) {
            echo"você é adulto <br>";
        } elseif ($idade>=12 && $idade<18) {
            echo"você é adolescente <br>";
        } else {
            echo"você é criança <br>";
        }
    echo"<br><br>";

    $nota1=4.1;
    $nota2=6.2;
    $nota3=4.8;
    $nota4=3.9;
    $mediaFinal=($nota1+$nota2+$nota3+$nota4)/4;
    echo"média: ".$mediaFinal."<br>";
    
    function situacaoAluno($media) {
        echo"média: ".$media."<br>";
        if ($media>=7) {
            echo"Aprovado Direto <br>";
        } elseif ($media>=4 && $media<7) {
            echo"Você foi para a prova final <br>";
        } elseif ($media<4) {
            echo"você está de recuperação <br>";
        }
    }
    
    situacaoAluno($mediaFinal);
    
    
    echo"<br><br>";
    $valor=44;
    function paridade($numero) {
        if ($numero%2==0) {
            echo"O número ".$numero." é par <br>";
        } else {
            echo"O número ".$numero." é impar <br>";
        }
    }

    paridade($valor);
    paridade(43);
    paridade(-43);
    paridade(-44);

    
    



    ?>

</body>
</html>
