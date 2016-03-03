/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonToken;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class qg
/*    */   extends TypeAdapter
/*    */ {
/*    */   qg(qf paramqf, Map paramMap) {}
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Object paramObject)
/*    */   {
/* 36 */     if (paramObject == null) {
/* 37 */       paramJsonWriter.nullValue();
/*    */     } else {
/* 39 */       paramJsonWriter.value(qf.a(this.b, paramObject));
/*    */     }
/*    */   }
/*    */   
/*    */   public Object read(JsonReader paramJsonReader)
/*    */   {
/* 45 */     if (paramJsonReader.peek() == JsonToken.NULL) {
/* 46 */       paramJsonReader.nextNull();
/* 47 */       return null;
/*    */     }
/* 49 */     return this.a.get(paramJsonReader.nextString());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */