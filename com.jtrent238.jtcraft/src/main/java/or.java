/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.File;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class or
/*    */   extends om
/*    */ {
/*    */   public or(File paramFile)
/*    */   {
/* 12 */     super(paramFile);
/*    */   }
/*    */   
/*    */   protected ol a(JsonObject paramJsonObject)
/*    */   {
/* 17 */     return new os(paramJsonObject);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String[] a()
/*    */   {
/* 26 */     String[] arrayOfString = new String[e().size()];
/* 27 */     int i = 0;
/* 28 */     for (os localos : e().values()) {
/* 29 */       arrayOfString[(i++)] = ((GameProfile)localos.f()).getName();
/*    */     }
/* 31 */     return arrayOfString;
/*    */   }
/*    */   
/*    */   protected String b(GameProfile paramGameProfile)
/*    */   {
/* 36 */     return paramGameProfile.getId().toString();
/*    */   }
/*    */   
/*    */   public GameProfile a(String paramString) {
/* 40 */     for (os localos : e().values()) {
/* 41 */       if (paramString.equalsIgnoreCase(((GameProfile)localos.f()).getName())) {
/* 42 */         return (GameProfile)localos.f();
/*    */       }
/*    */     }
/* 45 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\or.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */