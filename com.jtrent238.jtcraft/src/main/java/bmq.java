/*    */ import org.lwjgl.opengl.GL11;
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
/*    */ public class bmq
/*    */   extends bml
/*    */ {
/*    */   private blm b;
/*    */   
/*    */   public void a(aps paramaps, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*    */   {
/* 29 */     aji localaji = paramaps.a();
/* 30 */     if ((localaji.o() == awt.a) || (paramaps.a(paramFloat) >= 1.0F)) {
/* 31 */       return;
/*    */     }
/*    */     
/* 34 */     bmh localbmh = bmh.a;
/* 35 */     a(bpz.b);
/*    */     
/* 37 */     bam.a();
/*    */     
/* 39 */     GL11.glBlendFunc(770, 771);
/* 40 */     GL11.glEnable(3042);
/* 41 */     GL11.glDisable(2884);
/* 42 */     if (bao.y()) {
/* 43 */       GL11.glShadeModel(7425);
/*    */     } else {
/* 45 */       GL11.glShadeModel(7424);
/*    */     }
/*    */     
/* 48 */     localbmh.b();
/*    */     
/* 50 */     localbmh.b((float)paramDouble1 - paramaps.c + paramaps.b(paramFloat), (float)paramDouble2 - paramaps.d + paramaps.c(paramFloat), (float)paramDouble3 - paramaps.e + paramaps.d(paramFloat));
/* 51 */     localbmh.b(1.0F, 1.0F, 1.0F);
/* 52 */     if ((localaji == ajn.K) && (paramaps.a(paramFloat) < 0.5F))
/*    */     {
/* 54 */       this.b.a(localaji, paramaps.c, paramaps.d, paramaps.e, false);
/* 55 */     } else if ((paramaps.d()) && (!paramaps.b()))
/*    */     {
/* 57 */       ajn.K.a(((app)localaji).e());
/* 58 */       this.b.a(ajn.K, paramaps.c, paramaps.d, paramaps.e, paramaps.a(paramFloat) < 0.5F);
/* 59 */       ajn.K.e();
/*    */       
/* 61 */       localbmh.b((float)paramDouble1 - paramaps.c, (float)paramDouble2 - paramaps.d, (float)paramDouble3 - paramaps.e);
/* 62 */       this.b.d(localaji, paramaps.c, paramaps.d, paramaps.e);
/*    */     } else {
/* 64 */       this.b.a(localaji, paramaps.c, paramaps.d, paramaps.e);
/*    */     }
/* 66 */     localbmh.b(0.0D, 0.0D, 0.0D);
/* 67 */     localbmh.a();
/*    */     
/* 69 */     bam.b();
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb)
/*    */   {
/* 74 */     this.b = new blm(paramahb);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */