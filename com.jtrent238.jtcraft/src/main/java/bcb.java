/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcb
/*    */   extends bbw
/*    */ {
/* 12 */   protected static final bqx a = new bqx("textures/gui/widgets.png");
/*    */   
/* 14 */   protected int f = 200;
/* 15 */   protected int g = 20;
/*    */   public int h;
/*    */   public int i;
/*    */   public String j;
/* 19 */   public int k; public boolean l = true;
/* 20 */   public boolean m = true;
/*    */   protected boolean n;
/*    */   
/*    */   public bcb(int paramInt1, int paramInt2, int paramInt3, String paramString) {
/* 24 */     this(paramInt1, paramInt2, paramInt3, 200, 20, paramString);
/*    */   }
/*    */   
/*    */   public bcb(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString) {
/* 28 */     this.k = paramInt1;
/* 29 */     this.h = paramInt2;
/* 30 */     this.i = paramInt3;
/* 31 */     this.f = paramInt4;
/* 32 */     this.g = paramInt5;
/* 33 */     this.j = paramString;
/*    */   }
/*    */   
/*    */   public int a(boolean paramBoolean) {
/* 37 */     int i1 = 1;
/* 38 */     if (!this.l) { i1 = 0;
/* 39 */     } else if (paramBoolean) i1 = 2;
/* 40 */     return i1;
/*    */   }
/*    */   
/*    */   public void a(bao parambao, int paramInt1, int paramInt2) {
/* 44 */     if (!this.m) { return;
/*    */     }
/* 46 */     bbu localbbu = parambao.l;
/*    */     
/* 48 */     parambao.P().a(a);
/* 49 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 51 */     this.n = ((paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g));
/* 52 */     int i1 = a(this.n);
/*    */     
/* 54 */     GL11.glEnable(3042);
/* 55 */     buu.c(770, 771, 1, 0);
/* 56 */     GL11.glBlendFunc(770, 771);
/* 57 */     b(this.h, this.i, 0, 46 + i1 * 20, this.f / 2, this.g);
/* 58 */     b(this.h + this.f / 2, this.i, 200 - this.f / 2, 46 + i1 * 20, this.f / 2, this.g);
/*    */     
/* 60 */     b(parambao, paramInt1, paramInt2);
/*    */     
/* 62 */     int i2 = 14737632;
/* 63 */     if (!this.l) {
/* 64 */       i2 = 10526880;
/* 65 */     } else if (this.n) {
/* 66 */       i2 = 16777120;
/*    */     }
/* 68 */     a(localbbu, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, i2);
/*    */   }
/*    */   
/*    */ 
/*    */   protected void b(bao parambao, int paramInt1, int paramInt2) {}
/*    */   
/*    */   public void a(int paramInt1, int paramInt2) {}
/*    */   
/*    */   public boolean c(bao parambao, int paramInt1, int paramInt2)
/*    */   {
/* 78 */     return (this.l) && (this.m) && (paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 82 */     return this.n;
/*    */   }
/*    */   
/*    */ 
/*    */   public void b(int paramInt1, int paramInt2) {}
/*    */   
/*    */   public void a(btp parambtp)
/*    */   {
/* 90 */     parambtp.a(bso.a(new bqx("gui.button.press"), 1.0F));
/*    */   }
/*    */   
/*    */   public int b() {
/* 94 */     return this.f;
/*    */   }
/*    */   
/*    */   public int c() {
/* 98 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */