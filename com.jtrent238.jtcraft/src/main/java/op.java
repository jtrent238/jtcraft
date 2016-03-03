/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.File;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class op extends om
/*    */ {
/*    */   public op(File paramFile)
/*    */   {
/* 11 */     super(paramFile);
/*    */   }
/*    */   
/*    */   protected ol a(JsonObject paramJsonObject)
/*    */   {
/* 16 */     return new oq(paramJsonObject);
/*    */   }
/*    */   
/*    */   public boolean a(GameProfile paramGameProfile) {
/* 20 */     return d(paramGameProfile);
/*    */   }
/*    */   
/*    */   public String[] a()
/*    */   {
/* 25 */     String[] arrayOfString = new String[e().size()];
/* 26 */     int i = 0;
/* 27 */     for (oq localoq : e().values()) {
/* 28 */       arrayOfString[(i++)] = ((GameProfile)localoq.f()).getName();
/*    */     }
/* 30 */     return arrayOfString;
/*    */   }
/*    */   
/*    */   protected String b(GameProfile paramGameProfile)
/*    */   {
/* 35 */     return paramGameProfile.getId().toString();
/*    */   }
/*    */   
/*    */   public GameProfile a(String paramString) {
/* 39 */     for (oq localoq : e().values()) {
/* 40 */       if (paramString.equalsIgnoreCase(((GameProfile)localoq.f()).getName())) {
/* 41 */         return (GameProfile)localoq.f();
/*    */       }
/*    */     }
/* 44 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\op.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */