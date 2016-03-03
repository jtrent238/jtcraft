/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
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
/*    */ public abstract class blg
/*    */   extends yz
/*    */   implements bro
/*    */ {
/* 19 */   public static final bqx b = new bqx("textures/entity/steve.png");
/*    */   
/*    */ 
/*    */ 
/*    */   private bqx a;
/*    */   
/*    */ 
/*    */ 
/*    */   private bqx c;
/*    */   
/*    */ 
/*    */ 
/*    */   public blg(ahb paramahb, GameProfile paramGameProfile)
/*    */   {
/* 33 */     super(paramahb, paramGameProfile);
/*    */     
/* 35 */     String str = b_();
/* 36 */     if (!str.isEmpty()) {
/* 37 */       brj localbrj = bao.B().ad();
/* 38 */       localbrj.a(paramGameProfile, this, true);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean n() {
/* 43 */     return this.c != null;
/*    */   }
/*    */   
/*    */   public boolean o() {
/* 47 */     return this.a != null;
/*    */   }
/*    */   
/*    */   public bqx r() {
/* 51 */     return this.a == null ? b : this.a;
/*    */   }
/*    */   
/*    */   public bqx s()
/*    */   {
/* 56 */     return this.c;
/*    */   }
/*    */   
/*    */   public static bpr a(bqx parambqx, String paramString) {
/* 60 */     bqf localbqf = bao.B().P();
/*    */     
/* 62 */     Object localObject = localbqf.b(parambqx);
/* 63 */     if (localObject == null) {
/* 64 */       localObject = new bpr(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", new Object[] { qn.a(paramString) }), b, new bmc());
/* 65 */       localbqf.a(parambqx, (bqh)localObject);
/*    */     }
/*    */     
/* 68 */     return (bpr)localObject;
/*    */   }
/*    */   
/*    */   public static bqx c(String paramString) {
/* 72 */     return new bqx("skins/" + qn.a(paramString));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(MinecraftProfileTexture.Type paramType, bqx parambqx)
/*    */   {
/* 81 */     switch (blh.a[paramType.ordinal()]) {
/*    */     case 1: 
/* 83 */       this.a = parambqx;
/* 84 */       break;
/*    */     case 2: 
/* 86 */       this.c = parambqx;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */