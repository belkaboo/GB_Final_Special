<center>
    <h2>
    Блок заданий по Linux
    </h2>
</center>

1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).

    <details>
        <summary>Выполнение</summary>
        <p align = "center">
            <img width="400" height="250" src="images/image1.png">
        </p>
    </details>


2. Создать директорию, переместить файл туда.

    <details>
    <summary>Выполнение</summary>
     <p align = "center">
            <img width="400" height="250" src="images/image2.png">
        </p>


    </details>

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
    <details>
    <summary>Выполнение</summary>

    sudo wget https://repo.mysql.com//mysql-apt-config_0.8.24-1_all.deb

    sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb

    sudo apt update

    sudo apt install mysql-client

    >проверка подключенного репозитория

    ls /etc/apt/sources.list.d/


    </details>

4. Установить и удалить deb-пакет с помощью dpkg.
    <details>
    <summary>Выполнение</summary>

    dpkg -l | grep net-tools

    wget http://archive.ubuntu.com/ubuntu/pool/main/n/net-tools/net-tools_1.60+git2016111690da8a0-1ubuntu1_amd64.deb

    sudo dpkg -i net-tools_1.60+git20161116.90da8a0-1ubuntu1_amd64.deb

    dpkg -l | grep net-tools

    sudo dpkg -r net-tools

    dpkg -l | grep net-tools

    
    <p align = "center">
            <img width="400" height="250" src="images/image3.png">
        </p>
    


    </details>

5. Выложить историю команд в терминале ubuntu
    <details>
    <summary>Выполнение</summary>
    hystory
        <p align = "center">
            <img width="400" height="250" src="images/image5.png">
        </p>
    </details>