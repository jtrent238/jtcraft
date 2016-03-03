/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ public class bqx
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   
/*    */   public bqx(String paramString1, String paramString2)
/*    */   {
/* 10 */     Validate.notNull(paramString2);
/*    */     
/* 12 */     if ((paramString1 == null) || (paramString1.length() == 0)) {
/* 13 */       this.a = "minecraft";
/*    */     } else {
/* 15 */       this.a = paramString1;
/*    */     }
/*    */     
/* 18 */     this.b = paramString2;
/*    */   }
/*    */   
/*    */   public bqx(String paramString) {
/* 22 */     String str1 = "minecraft";
/* 23 */     String str2 = paramString;
/*    */     
/* 25 */     int i = paramString.indexOf(':');
/* 26 */     if (i >= 0) {
/* 27 */       str2 = paramString.substring(i + 1, paramString.length());
/* 28 */       if (i > 1) {
/* 29 */         str1 = paramString.substring(0, i);
/*    */       }
/*    */     }
/*    */     
/* 33 */     this.a = str1.toLowerCase();
/* 34 */     this.b = str2;
/*    */   }
/*    */   
/*    */   public String a() {
/* 38 */     return this.b;
/*    */   }
/*    */   
/*    */   public String b() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 47 */     return this.a + ":" + this.b;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 52 */     if (this == paramObject) { return true;
/*    */     }
/* 54 */     if ((paramObject instanceof bqx)) {
/* 55 */       bqx localbqx = (bqx)paramObject;
/*    */       
/* 57 */       return (this.a.equals(localbqx.a)) && (this.b.equals(localbqx.b));
/*    */     }
/*    */     
/* 60 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 65 */     return 31 * this.a.hashCode() + this.b.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */