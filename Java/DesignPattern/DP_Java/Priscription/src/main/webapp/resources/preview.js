$(document).ready(function(){
 var p=$("#preview");
 $("#html").live('keyup',function(){
  p.find("#htmlpr").html($(this).val());
 });
 $("#css").live('keyup',function(){
  p.find("#csspr").html($(this).val());
 });
 $("#js").live('change',function(){
  p.find("#jspr").remove();
  p.append('<script id="jspr">'+"$(document).ready(function(){"+$(this).val()+"});"+'</script>');
 });
 $("#upjs").live('click',function(){
  p.find("#jspr").remove();
  p.append('<script id="jspr">'+"$(document).ready(function(){"+$("#js").val()+"});"+'</script>');
 });
});
