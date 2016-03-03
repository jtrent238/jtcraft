/*     */ import java.util.List;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bfu
/*     */   extends bfo
/*     */ {
/*     */   private float u;
/*     */   private float v;
/*     */   
/*     */   public bfu(yz paramyz)
/*     */   {
/*  19 */     super(paramyz.bn);
/*  20 */     this.p = true;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  25 */     if (this.k.c.h()) {
/*  26 */       this.k.a(new bfl(this.k.h));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  32 */     this.n.clear();
/*  33 */     if (this.k.c.h()) {
/*  34 */       this.k.a(new bfl(this.k.h));
/*     */     } else {
/*  36 */       super.b();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2)
/*     */   {
/*  42 */     this.q.b(brp.a("container.crafting", new Object[0]), 86, 16, 4210752);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/*  47 */     super.a(paramInt1, paramInt2, paramFloat);
/*  48 */     this.u = paramInt1;
/*  49 */     this.v = paramInt2;
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*     */   {
/*  54 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  55 */     this.k.P().a(a);
/*  56 */     int i = this.i;
/*  57 */     int j = this.r;
/*  58 */     b(i, j, 0, 0, this.f, this.g);
/*     */     
/*  60 */     a(i + 51, j + 75, 30, i + 51 - this.u, j + 75 - 50 - this.v, this.k.h);
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, sv paramsv) {
/*  64 */     GL11.glEnable(2903);
/*     */     
/*  66 */     GL11.glPushMatrix();
/*  67 */     GL11.glTranslatef(paramInt1, paramInt2, 50.0F);
/*  68 */     GL11.glScalef(-paramInt3, paramInt3, paramInt3);
/*  69 */     GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*     */     
/*  71 */     float f1 = paramsv.aM;
/*  72 */     float f2 = paramsv.y;
/*  73 */     float f3 = paramsv.z;
/*  74 */     float f4 = paramsv.aP;
/*  75 */     float f5 = paramsv.aO;
/*     */     
/*  77 */     GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
/*  78 */     bam.b();
/*  79 */     GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
/*     */     
/*  81 */     GL11.glRotatef(-(float)Math.atan(paramFloat2 / 40.0F) * 20.0F, 1.0F, 0.0F, 0.0F);
/*     */     
/*  83 */     paramsv.aM = ((float)Math.atan(paramFloat1 / 40.0F) * 20.0F);
/*  84 */     paramsv.y = ((float)Math.atan(paramFloat1 / 40.0F) * 40.0F);
/*  85 */     paramsv.z = (-(float)Math.atan(paramFloat2 / 40.0F) * 20.0F);
/*  86 */     paramsv.aO = paramsv.y;
/*  87 */     paramsv.aP = paramsv.y;
/*     */     
/*  89 */     GL11.glTranslatef(0.0F, paramsv.L, 0.0F);
/*  90 */     bnn.a.j = 180.0F;
/*  91 */     bnn.a.a(paramsv, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
/*     */     
/*  93 */     paramsv.aM = f1;
/*  94 */     paramsv.y = f2;
/*  95 */     paramsv.z = f3;
/*  96 */     paramsv.aP = f4;
/*  97 */     paramsv.aO = f5;
/*  98 */     GL11.glPopMatrix();
/*  99 */     bam.a();
/* 100 */     GL11.glDisable(32826);
/*     */     
/* 102 */     buu.j(buu.c);
/* 103 */     GL11.glDisable(3553);
/* 104 */     buu.j(buu.b);
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 109 */     if (parambcb.k == 0) {
/* 110 */       this.k.a(new bei(this, this.k.h.m()));
/*     */     }
/* 112 */     if (parambcb.k == 1) {
/* 113 */       this.k.a(new bej(this, this.k.h.m()));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */