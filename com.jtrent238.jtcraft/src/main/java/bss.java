/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.lang.reflect.Type;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ public class bss implements com.google.gson.JsonDeserializer
/*    */ {
/*    */   public bsp a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*    */   {
/* 12 */     JsonObject localJsonObject1 = pu.l(paramJsonElement, "entry");
/* 13 */     bsp localbsp = new bsp();
/*    */     
/* 15 */     localbsp.a(pu.a(localJsonObject1, "replace", false));
/*    */     
/* 17 */     w localw = w.a(pu.a(localJsonObject1, "category", w.a.a()));
/* 18 */     localbsp.a(localw);
/* 19 */     Validate.notNull(localw, "Invalid category", new Object[0]);
/*    */     
/* 21 */     if (localJsonObject1.has("sounds")) {
/* 22 */       JsonArray localJsonArray = pu.t(localJsonObject1, "sounds");
/* 23 */       for (int i = 0; i < localJsonArray.size(); i++) {
/* 24 */         JsonElement localJsonElement = localJsonArray.get(i);
/* 25 */         bsq localbsq = new bsq();
/*    */         
/* 27 */         if (pu.a(localJsonElement)) {
/* 28 */           localbsq.a(pu.a(localJsonElement, "sound"));
/*    */         } else {
/* 30 */           JsonObject localJsonObject2 = pu.l(localJsonElement, "sound");
/* 31 */           localbsq.a(pu.h(localJsonObject2, "name"));
/*    */           
/* 33 */           if (localJsonObject2.has("type")) {
/* 34 */             bsr localbsr = bsr.a(pu.h(localJsonObject2, "type"));
/* 35 */             Validate.notNull(localbsr, "Invalid type", new Object[0]);
/* 36 */             localbsq.a(localbsr);
/*    */           }
/*    */           float f;
/* 39 */           if (localJsonObject2.has("volume")) {
/* 40 */             f = pu.k(localJsonObject2, "volume");
/* 41 */             Validate.isTrue(f > 0.0F, "Invalid volume", new Object[0]);
/* 42 */             localbsq.a(f);
/*    */           }
/*    */           
/* 45 */           if (localJsonObject2.has("pitch")) {
/* 46 */             f = pu.k(localJsonObject2, "pitch");
/* 47 */             Validate.isTrue(f > 0.0F, "Invalid pitch", new Object[0]);
/* 48 */             localbsq.b(f);
/*    */           }
/*    */           
/* 51 */           if (localJsonObject2.has("weight")) {
/* 52 */             int j = pu.m(localJsonObject2, "weight");
/* 53 */             Validate.isTrue(j > 0, "Invalid weight", new Object[0]);
/* 54 */             localbsq.a(j);
/*    */           }
/*    */           
/* 57 */           if (localJsonObject2.has("stream")) {
/* 58 */             localbsq.a(pu.i(localJsonObject2, "stream"));
/*    */           }
/*    */         }
/*    */         
/* 62 */         localbsp.a().add(localbsq);
/*    */       }
/*    */     }
/*    */     
/* 66 */     return localbsp;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */