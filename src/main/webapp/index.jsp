<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
<script type="text/javascript">
    var a = "undefined";
    var b = undefined;
    var c = "false";
    var d = "";

    function assert(aVar) {
        if (aVar) {
            console.log(true);
        } else {
            console.log(false);
        }
    }

    assert(a);
    assert(b);
    assert(c);
    assert(d);
</script>
