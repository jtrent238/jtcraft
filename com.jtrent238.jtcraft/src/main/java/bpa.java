/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpa
/*    */   extends bok
/*    */ {
/* 10 */   private static final bqx f = new bqx("textures/entity/villager/villager.png");
/* 11 */   private static final bqx g = new bqx("textures/entity/villager/farmer.png");
/* 12 */   private static final bqx h = new bqx("textures/entity/villager/librarian.png");
/* 13 */   private static final bqx k = new bqx("textures/entity/villager/priest.png");
/* 14 */   private static final bqx l = new bqx("textures/entity/villager/smith.png");
/* 15 */   private static final bqx m = new bqx("textures/entity/villager/butcher.png");
/*    */   protected bik a;
/*    */   
/*    */   public bpa() {
/* 19 */     super(new bik(0.0F), 0.5F);
/*    */     
/* 21 */     this.a = ((bik)this.i);
/*    */   }
/*    */   
/*    */ 
/*    */   protected int a(yv paramyv, int paramInt, float paramFloat)
/*    */   {
/* 27 */     return -1;
/*    */   }
/*    */   
/*    */   public void a(yv paramyv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 32 */     super.a(paramyv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(yv paramyv)
/*    */   {
/* 37 */     switch (paramyv.bZ()) {
/*    */     case 0: 
/* 39 */       return g;
/*    */     case 1: 
/* 41 */       return h;
/*    */     case 2: 
/* 43 */       return k;
/*    */     case 3: 
/* 45 */       return l;
/*    */     case 4: 
/* 47 */       return m;
/*    */     }
/* 49 */     return f;
/*    */   }
/*    */   
/*    */ 
/*    */   protected void a(yv paramyv, float paramFloat)
/*    */   {
/* 55 */     super.c(paramyv, paramFloat);
/*    */   }
/*    */   
/*    */   protected void b(yv paramyv, float paramFloat)
/*    */   {
/* 60 */     float f1 = 0.9375F;
/* 61 */     if (paramyv.d() < 0) {
/* 62 */       f1 = (float)(f1 * 0.5D);
/* 63 */       this.d = 0.25F;
/* 64 */     } else { this.d = 0.5F; }
/* 65 */     GL11.glScalef(f1, f1, f1);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */