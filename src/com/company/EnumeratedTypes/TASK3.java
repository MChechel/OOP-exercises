package com.company.EnumeratedTypes;

public class TASK3 {
    //Temperature converter
    public static void main(String[] args) {
        float convertedTemp =
                TemperatureConvert.convertTemperature('C', 'F', 34f);
        System.out.println(convertedTemp);
    }

}

interface Converter{
    float convert(float tempIn);
}


enum TemperatureConvert{
    C_F('C','F',new Converter(){
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }),
    C_K('C','K',new Converter(){
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15f;
        }
    }),
    K_C('K','C',new Converter(){
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    F_C('F','C',new Converter(){
        @Override
        public float convert(float tempIn) {
            return (tempIn -32) / 9 * 5;
        }
    }),
    K_F('K','F',new Converter(){
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32f) * 5 / 9 + 273.15f;

        }
    }),
    F_K('F','K',new Converter(){
        @Override
        public float convert(float tempIn) {
            return (tempIn - 273.15f) * 9 / 5 + 32;

        }
    });
    char inpurTempUnit;
    char outTempUnit;
    Converter converter;
    TemperatureConvert(char inputTempUnit, char outTempUnit,Converter converter){
        this.inpurTempUnit=inputTempUnit;
        this.outTempUnit=outTempUnit;
        this.converter=converter;
    }

    public static float convertTemperature(char input, char output, float temp) {
        for (TemperatureConvert temperatureConverter : values())
        {
            if (temperatureConverter.inpurTempUnit == input && temperatureConverter.outTempUnit == output) {
                return
                        temperatureConverter.converter.convert(temp);
            }
        }
        return Integer.MIN_VALUE;
    }


}