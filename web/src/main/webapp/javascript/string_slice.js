let str = 'good, morning!';
document.write(str)
document.write('<br><br>')
document.write('str.slice(2,7)')
document.write('<br>>><br>')
document.write(str.slice(2, 7));
document.write('<br><br>')
document.write('str.slice(2)')
document.write('<br>>><br>')
document.write(str.slice(2));
document.write('<br><br>')
document.write('str.slice(2, -2)')
document.write('<br>>><br>')
document.write(str.slice(2, -2));
document.write('<br><br>')
document.write('str.slice(2, 7)')
document.write('<br>>><br>')
document.write(str.slice(2, 7));

document.write('<br><br>')
document.write('str.substring(0,7)')
document.write('<br>>><br>')
document.write(str.substring(0, 7));

document.write('<br><br>')
document.write('str.indexOf("mor")')
document.write('<br>>><br>')
document.write(str.indexOf("mor"));

str += ' good afternoon!';
document.write('<br><br>')
document.write(str);

document.write('<br><br>')
document.write('str.lastIndexOf("good")')
document.write('<br>>><br>')
document.write(str.lastIndexOf('good'));
