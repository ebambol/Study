void setup() { Serial.begin(9600);  }
void loop() {
    for(int i = 0; i < 156; i++){ // 점점 밝아지게
      Serial.print("i = ");
      Serial.println(i);
      analogWrite(11, i);
      analogWrite(12, i);
      analogWrite(13, i); 
      delay(25);
    }
    for(int i = 155; i > -1; i--){ // 점점 어두워지게
      analogWrite(11, i);
      analogWrite(12, i);
      analogWrite(13, i); 
      delay(25);
    } 
}
