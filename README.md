# Everythong to ASCII
A library to trnaform any type of media into ascii art

```
▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░       ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ▒▒▒▒▒▒▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓   ▒▒▒▒▒▒   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓   ▒▒▒▒▒▒▒▒▒   ▓▓▓▓▓▓▓▓▓▓▓  ▒▒▒▒▒▒▒▒▒░  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ▒▒▒▒▒▒▒▒▒▒▒▒   ▓▓▓▓▓▓▓▓   ▒▒▒▒▒▒▒▒▒▒▒▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓▓▓▓▓  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒           ▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓▓▓▓  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒░░▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▓▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓▓▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒░░▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▓▓▓▓▓▓▓▓▓▓
▓▓▓▓▓▓▓▓▓░  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▓▓▓▓▓▓▓▓▓
▓▓           ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒           ▓▓
▓▓▓▓▓▓▓  ░▒▒▒  ▒▒▒▒▒▒▒    ▒▒▒▒  ▒▒  ▒▒  ▒▒▒▒    ▒▒▒▒▒▒▒  ▒▒▒░  ▓▓▓▓▓▓▓
▓▓▓▓▓▓       ▒▒▒▒▒▒▒▒▒     ▒▒▒▒        ▒▒▒▒▒     ▒▒▒▒▒▒▒▒░      ▓▓▓▓▓▓
▓      ░▒▒▒░  ▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒▒  ░▒▒▒░      ▓
▓▓▓▓▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▓▓▓▓
▓▓▓▓  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▓▓▓
```

![alt text](https://github.com/UwUDev/Everything-To-Ascii/blob/master/preview.gif?raw=true)

And please, put a star if you enjoy my work, it costs nothing and it lets me know if the project has pleased

### Prerequisites

Make sure you have Java 8 or higher and chrome ver. 85 (lastest) before starting

* Download Java 8 [Here](https://www.java.com/download/)  
And thats all

## Running

For example if you wants to turn an image into ASCII

```
ImgToAscii ascii = new ImgToAscii(new File("file.jpg")); // works with png, jpeg etc...
ascii.setDensity(13);
ascii.convert(); //Very important
ascii.print();
```
<br>
And with a gif :

```
GifToAscii ascii = new GifToAscii(new File("file.gif"));
ascii.setDensity(4);
ascii.setPlayDelay(200);
ascii.convert();
ascii.setPlayLoops(50);
ascii.play();
```
<br>

**Note: never forget the** `convert();`

<br>
<br>

### The `setDensity(int)` method:  
This method is used for the "compression"  .
For example:

```
ascii.setDensity(4);
ascii.convert();
ascii.print();
```
<br>

### The `setChars()` method:  
This method is used for edit the gradient.
For example:

```
ascii.setCharById(";", 4); //will replace the 5th char of the gradient by ';'
ascii.setChars(" ", " ", "░", "░", "▒", "▒", "▓", "▓", "█");
ascii.convert();
ascii.print();
```

I use this code to make the cat at the top of the readme

<br>

### The `exportToTxtFile(String, boolean)` method:  
This method is used for export the image.  
**NOTE: if you export a gif this will split frames and you have to put A FOLDER path**  
For example:

```
ascii.convert();
ascii.exportToTxtFile("result.txt", true);
```

The true means the file encoding will be UTF-8, false means ASCII.  

<br>
Same example with a gif:

```
ascii.convert();
ascii.exportToFolder("result", true);
```
And you will have something line :

```
result
   │
   ├───1.txt
   ├───2.txt
   ├───3.txt
   └───4.txt
```

<br>

### The `invert(boolean)` method:  
This method just reverse the gradient to invert colors.

<br>

### The `setPlayDelay(int)` and `play()` method:  
This two methods are used for play the gif and set the frame rate.

```
ascii.setPlayDelay(250);
ascii.convert();
ascii.play();
```

Here we have a frame rate of 4 fps.  
To calculate this, you have to do `1000/delay`

<br>

### The `setPlayLoops(int)` method:  
This methos is used for set how much time the gif will loop

```
ascii.setPlayDelay(250);
ascii.convert();
ascii.setPlayLoops(500);
ascii.play();
```

## Author

* **UwU#0001** - [GitHub](https://github.com/UwU0001)

## Contact
[![Discord](https://discordapp.com/api/guilds/752493878334193674/widget.png)](https://discord.gg/fjzQ9AD)
[![MIT license](https://img.shields.io/badge/-Telegram-blue.svg)](https://t.me/UwUDev)
