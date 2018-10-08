<!DOCTYPE html>
<html>
 <head>
  <script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
  <script src="resources/preview.js"></script>
 </head>
 <body>
  <div id="content" style="margin-top:10px;height:70%;">
   <center><h1 style="margin:10px 0px 0px 0px;">HTML, CSS, JS Code Editor Using jQuery</h1></center>
   <table>
    <tbody>
     <tr>
      <td>
       <h2>HTML</h2>
       <textarea class="codes" id="html" placeholder="Your HTML Code HERE"></textarea>      
      </td>
      <td>
       <h2>CSS</h2>
       <textarea class="codes" id="css" placeholder="Your CSS Code HERE"></textarea>
      </td>
     </tr>
     <tr>
      <td>
       <h2>JS</h2>
       <textarea class="codes" id="js" placeholder="Your JavaScript Code HERE"></textarea>
      </td>
      <td>
       <h2>Preview</h2>
       <div id="preview">
        <span id="htmlpr"></span>
        <style id="csspr"></style>
       </div>
      </td>
     </tr>
     <tr>
      <td>
      <div style="text-align:right;"><input id="upjs" type="button" value="Update And Run JS"/></div>
      </td>
     </tr>
    </tbody>
   </table>
  </div>
  <style>
  .codes,#preview{
   width: 320px;
   height: 135px;
   border:2px dashed white;
   background:white;
   color:black;
   overflow:auto;
  }
  </style>
<!-- http://www.subinsb.com/2012/10/text-editor-using-javascript-jquery.html -->
 </body>
</html>
