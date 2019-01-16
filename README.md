## Introduction
Just a demo which shows the usage of SPI(Service Provider Interface) in java.

## How to use
Run `SpiTest` in IDEA, and you will see the result:

```
NumberA: 6, NumberB: 3
Operation: division
2
Operation: plus
9
```

## Componets
* plugin-api : api interface
* plugin-division : division plugin implements the interface
* plugin-plus : plus plugin implements the interface
* app : entry to run the plugins