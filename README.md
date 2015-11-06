# Halo 5 API

Basic Halo 5 API Wrapper written with Retrofit.

## Usage

See Unit tests and Sample App for examples.

## Testing Lib and Running Sample App

In order to test the library or build the sample app, you must put your 
apiKey into a file called apiKey under secure/.  This will be ignored by 
git automatically.

## Working with Sprites

The Medals have images contained within a spritesheet.  I've created an example
adapter within the sample app which cuts the individual medals out and stores them
in an LRU cache on the fly.  In this way, I am using picasso for the source image
and using my own internal cache for each separate sprite frame.  This is probably not
the best option, due to bitmap memory allocation, but it saves us from having to 
download or populate a bitmap of the source image every time we want a medal's sprite.

## Features

* Metadata API (complete)
* Stats API
* Profile API (grabs 302s)

## Roadmap

* Linking Framework (Stats to Metadata linkage)