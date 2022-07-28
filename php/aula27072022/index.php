<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Básico de PHP</title>

<style>
        h1 {
            color: red;
        }
        img {
            width: 50px;
        }
        .form_container{
            /* height:300px; */
            display:flex;
            
            justify-content: center;
            align-items: center;
            color: white;
            padding: 40px;
        }
        .formulario{
            display:flex;
            justify-content: center;
            align-items: center;
            width: 300px;
            height:300px;
            background: black;
            
            
            
        }

    </style>

</head>
<body>
    <br><br>
    <a href="#fim">fim da página</a>

    <?php

    $x=21;
    $y=2;
    echo"<h1>Conceitos Básicos de PHP</h1><br>";
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

    echo"<br><br>";
    echo"Lopp for simples<br>";
    for ($inc=0;$inc<=35;$inc++) {
        echo"Interação: ".$inc."<br>";
    }

    echo"<br><br>";
    echo"Lopp for simples apenas pares<br>";
    for ($inc=0;$inc<=35;$inc++) {
        if ($inc%2==0) {
            echo"Interação par:  ".$inc."<br>";
        }
    }

    echo"<br><br>";
    echo"Lopp while simples<br>";
    $inc=0;
    while ($inc <= 10) {
        echo"Interação: ".$inc."<br>";
        $inc++;
    }

    echo"<br><br>";
    echo"Lopp do-while simples<br>";
    $inc=10;
    do {
        echo"Interação: ".$inc."<br>";
        $inc--;
    } while ($inc >= 0);

    echo"<br><br>";
    echo"Lopp while simples<br>";
    $inc=0;
    while ($inc <= 10) {
        ?> 
        <!-- Fechou o html aqui -->
        <!-- aqui o código é html puro -->
        Teste de repetição com html dentro do loop :     
        <img src="imagem1.png" alt="">
        <!-- abriu novamente o php aqui -->
        <?php 
        echo" interação: ".$inc."<br>";
        $inc++;
    }

    echo"<br><br>";
    echo"Lopp while simples<br>";
    $inc=0;
    while ($inc <= 10) {
        ?> 
        <!-- Fechou o html aqui -->
        <!-- aqui o código é html puro -->
        Teste de repetição com html dentro do loop : [<?= $inc ?>]=    
        <img src="imagem1.png" alt="">
        <!-- abriu novamente o php aqui -->
        <?php 
        echo" interação: ".$inc."<br>";
        $inc++;
    }

    echo"<br><br>";
    echo"Vetores<br>";
    $cars = array("Volvo", "BMW", "Toyota");
    echo "I like " . $cars[0] . ", " . $cars[1] . " and " . $cars[2] . ".<br>";
    for($inc=0;$inc<3;$inc++){
        echo"cars[".$inc."]: ".$cars[$inc]."<br>";
    }
    echo"tamanho de cars: ".count($cars)."<br>";
    
    echo"fazendo o push de mais elementos<br>";
    array_push($cars,"Tesla","Renault","Citroen");
    echo"tamanho de cars: ".count($cars)."<br>";
    for($inc=0;$inc<count($cars);$inc++){
        echo"cars[".$inc."]: ".$cars[$inc]."<br>";
    }

    echo"<br><br>";

    $frutas = array("banana","melância","melão","manga","goiaba","uva","pera","maçã","mamão","manga");
    for($inc=0;$inc<count($frutas);$inc++) {
        echo"fruta[".$inc."]: ".$frutas[$inc]."<br>";
    }
    echo"<h2>a fruta escolhida é: ".$frutas[5]."</h2>";




    echo"<br><br>";
    echo"<br><br>";
    echo"Formulários - php - variaveis globais";
    ?>
    <div class="form_container">
        <div class="formulario">
            <form action="calcular.php" method="POST">
                <label for="a">Valor A:</label>
                <input type="text" name="a" id="a">
                <br><br>
                <label for="b">Valor B:</label>
                <input type="text" name="b" id="b">
                <br><br>
                <label for="op">Operação matemática</label>
                <select name="op" id="op">
                    <option value="add">soma</option>
                    <option value="subtract">subtração</option>
                    <option value="multiply">multiplicação</option>
                    <option value="divide">divisão</option>
                </select>
                <br><br>
                <input type="submit" value="Calcular" name="submit">
            </form> 
        </div>
    </div>
    
    
    

    <?php


    $link = "http://www.google.com";
    echo"<br><br>";
    ?>
<a href="<?= $link ?>">Click here to go to Google.</a>
<p id="fim"></p>
</body>
</html>
