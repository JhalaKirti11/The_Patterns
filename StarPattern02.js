 /*         * * * * *  
             * * * *  
              * * *  
               * *  
                *         */

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <script>
        let n = 5;
        for (i = 1; i <= n; i++) {
              for (let j = 1; j <= i - 1; j++) {
                document.write("&nbsp&nbsp");
            }
            for (let j = 1; j <= n - i + 1; j++) {
                document.write("*" + "&nbsp&nbsp");
            }
            document.writeln("<br>");
        }
    </script>
</body>

</html>
