/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.util.UUIDTypeAdapter;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bbs
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final String c;
/*    */   private final bbt d;
/*    */   
/*    */   public bbs(String paramString1, String paramString2, String paramString3, String paramString4)
/*    */   {
/* 19 */     this.a = paramString1;
/* 20 */     this.b = paramString2;
/* 21 */     this.c = paramString3;
/* 22 */     this.d = bbt.a(paramString4);
/*    */   }
/*    */   
/*    */   public String a() {
/* 26 */     return "token:" + this.c + ":" + this.b;
/*    */   }
/*    */   
/*    */   public String b() {
/* 30 */     return this.b;
/*    */   }
/*    */   
/*    */   public String c() {
/* 34 */     return this.a;
/*    */   }
/*    */   
/*    */   public String d() {
/* 38 */     return this.c;
/*    */   }
/*    */   
/*    */   public GameProfile e() {
/*    */     try {
/* 43 */       UUID localUUID = UUIDTypeAdapter.fromString(b());
/* 44 */       return new GameProfile(localUUID, c());
/*    */     } catch (IllegalArgumentException localIllegalArgumentException) {}
/* 46 */     return new GameProfile(null, c());
/*    */   }
/*    */   
/*    */   public bbt f()
/*    */   {
/* 51 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */