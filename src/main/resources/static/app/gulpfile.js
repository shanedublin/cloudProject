var gulp = require('gulp');
var cors = require('cors');

gulp.task('default', function() {
  console.log('gulp runs as expected');
});

gulp.task('build',function(){
  gulp.src("src/**/*")
    .pipe(gulp.dest('dist'));
});


gulp.task('webserver', function() {
    connect.server({
        root: 'dist',
        livereload: false,
        port: 8888,
	middleware: function() {
        	return [cors];
    	}
    });
});


var cors = function (req, res, next) {
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Headers', '*');
  res.setHeader('Access-Control-Allow-Methods','POST, GET, OPTIONS, PUT');
  res.setHeader('Cache-Control', 'max-age=315360000');
  //res.setHeader('Content-Type','application/x-www-form-urlencoded');
  //res.setHeader('Accept','*');
  next();
};
