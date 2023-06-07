FROM nginx:latest

WORKDIR /.
COPY . . 
COPY nginx.conf /etc/nginx/conf.d/default.conf
ADD . /usr/share/nginx/html 