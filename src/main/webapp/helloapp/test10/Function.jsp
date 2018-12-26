<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib prefix="function" uri="http://www.mydomain.com/function" %>
<html>
<head>
    <title>Using Function</title>
</head>
<body>
<h3>º¯Êý¹¦ÄÜ</h3>
<p>
    <from action="functions.jsp" method="post">
        text:<input type="text" name="text" size="20"/>
        <input type="submin" value="submit"/>
        </form>
<p>
    you entered:${function:oldString(param["text"])}
    <br>
    After reversing:${function:reverse(param["text"])}
    <br>
    After counting vowels:there are ${function:numVowels(param["text"])} vowels.
    <br>
    After exchanging:${function:caps(param["text"])}
    <br>
    After judging:the text weather is palinDrome?$ {function:palinDrome(param["text"])}
</body>
</html>
