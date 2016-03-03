/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mp
/*    */   implements ahh
/*    */ {
/*    */   private MinecraftServer a;
/*    */   private mt b;
/*    */   
/*    */   public mp(MinecraftServer paramMinecraftServer, mt parammt)
/*    */   {
/* 17 */     this.a = paramMinecraftServer;
/* 18 */     this.b = parammt;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(sa paramsa)
/*    */   {
/* 31 */     this.b.r().a(paramsa);
/*    */   }
/*    */   
/*    */   public void b(sa paramsa)
/*    */   {
/* 36 */     this.b.r().b(paramsa);
/*    */   }
/*    */   
/*    */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 41 */     this.a.ah().a(paramDouble1, paramDouble2, paramDouble3, paramFloat1 > 1.0F ? 16.0F * paramFloat1 : 16.0D, this.b.t.i, new hc(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2));
/*    */   }
/*    */   
/*    */   public void a(yz paramyz, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 46 */     this.a.ah().a(paramyz, paramDouble1, paramDouble2, paramDouble3, paramFloat1 > 1.0F ? 16.0F * paramFloat1 : 16.0D, this.b.t.i, new hc(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2));
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/*    */   
/*    */ 
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 55 */     this.b.t().a(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void b(int paramInt1, int paramInt2, int paramInt3) {}
/*    */   
/*    */ 
/*    */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {}
/*    */   
/*    */ 
/*    */   public void a(yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 68 */     this.a.ah().a(paramyz, paramInt2, paramInt3, paramInt4, 64.0D, this.b.t.i, new ha(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, false));
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 73 */     this.a.ah().a(new ha(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, true));
/*    */   }
/*    */   
/*    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 78 */     for (mw localmw : this.a.ah().e) {
/* 79 */       if ((localmw != null) && (localmw.o == this.b) && (localmw.y() != paramInt1)) {
/* 80 */         double d1 = paramInt2 - localmw.s;
/* 81 */         double d2 = paramInt3 - localmw.t;
/* 82 */         double d3 = paramInt4 - localmw.u;
/*    */         
/* 84 */         if (d1 * d1 + d2 * d2 + d3 * d3 < 1024.0D) {
/* 85 */           localmw.a.a(new ge(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5));
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void b() {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\mp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */