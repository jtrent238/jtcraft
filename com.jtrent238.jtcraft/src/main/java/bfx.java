/*     */ import java.util.List;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bfx
/*     */   extends bdw
/*     */ {
/*     */   private apm a;
/*     */   private int f;
/*     */   private int g;
/*     */   private bcb h;
/*     */   
/*     */   public bfx(apm paramapm)
/*     */   {
/*  26 */     this.a = paramapm;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  31 */     this.n.clear();
/*  32 */     Keyboard.enableRepeatEvents(true);
/*  33 */     this.n.add(this.h = new bcb(0, this.l / 2 - 100, this.m / 4 + 120, brp.a("gui.done", new Object[0])));
/*  34 */     this.a.a(false);
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/*  39 */     Keyboard.enableRepeatEvents(false);
/*  40 */     bjb localbjb = this.k.v();
/*  41 */     if (localbjb != null) localbjb.a(new jn(this.a.c, this.a.d, this.a.e, this.a.a));
/*  42 */     this.a.a(true);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  47 */     this.f += 1;
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  52 */     if (!parambcb.l) { return;
/*     */     }
/*  54 */     if (parambcb.k == 0) {
/*  55 */       this.a.e();
/*  56 */       this.k.a(null);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  62 */     if (paramInt == 200) this.g = (this.g - 1 & 0x3);
/*  63 */     if ((paramInt == 208) || (paramInt == 28) || (paramInt == 156)) this.g = (this.g + 1 & 0x3);
/*  64 */     if ((paramInt == 14) && (this.a.a[this.g].length() > 0)) {
/*  65 */       this.a.a[this.g] = this.a.a[this.g].substring(0, this.a.a[this.g].length() - 1);
/*     */     }
/*  67 */     if ((t.a(paramChar)) && (this.a.a[this.g].length() < 15)) {
/*  68 */       int tmp165_162 = this.g; String[] tmp165_158 = this.a.a;tmp165_158[tmp165_162] = (tmp165_158[tmp165_162] + paramChar);
/*     */     }
/*  70 */     if (paramInt == 1) {
/*  71 */       a(this.h);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/*  77 */     c();
/*     */     
/*  79 */     a(this.q, brp.a("sign.edit", new Object[0]), this.l / 2, 40, 16777215);
/*     */     
/*  81 */     GL11.glPushMatrix();
/*  82 */     GL11.glTranslatef(this.l / 2, 0.0F, 50.0F);
/*  83 */     float f1 = 93.75F;
/*  84 */     GL11.glScalef(-f1, -f1, -f1);
/*  85 */     GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*     */     
/*  87 */     aji localaji = this.a.q();
/*     */     
/*  89 */     if (localaji == ajn.an) {
/*  90 */       float f2 = this.a.p() * 360 / 16.0F;
/*  91 */       GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*     */       
/*  93 */       GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
/*     */     } else {
/*  95 */       int i = this.a.p();
/*  96 */       float f3 = 0.0F;
/*     */       
/*  98 */       if (i == 2) f3 = 180.0F;
/*  99 */       if (i == 4) f3 = 90.0F;
/* 100 */       if (i == 5) f3 = -90.0F;
/* 101 */       GL11.glRotatef(f3, 0.0F, 1.0F, 0.0F);
/* 102 */       GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
/*     */     }
/*     */     
/* 105 */     if (this.f / 6 % 2 == 0) { this.a.i = this.g;
/*     */     }
/* 107 */     bmk.a.a(this.a, -0.5D, -0.75D, -0.5D, 0.0F);
/* 108 */     this.a.i = -1;
/*     */     
/* 110 */     GL11.glPopMatrix();
/*     */     
/* 112 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */