/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ public class bfv
/*     */   extends bex
/*     */ {
/*  24 */   private static final Logger u = ;
/*  25 */   private static final bqx v = new bqx("textures/gui/container/villager.png");
/*     */   private agm w;
/*     */   private bfw x;
/*     */   private bfw y;
/*     */   private int z;
/*     */   private String A;
/*     */   
/*     */   public bfv(yx paramyx, agm paramagm, ahb paramahb, String paramString) {
/*  33 */     super(new aat(paramyx, paramagm, paramahb));
/*  34 */     this.w = paramagm;
/*  35 */     this.A = ((paramString == null) || (paramString.length() < 1) ? brp.a("entity.Villager.name", new Object[0]) : paramString);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  40 */     super.b();
/*     */     
/*  42 */     int i = (this.l - this.f) / 2;
/*  43 */     int j = (this.m - this.g) / 2;
/*     */     
/*  45 */     this.n.add(this.x = new bfw(1, i + 120 + 27, j + 24 - 1, true));
/*  46 */     this.n.add(this.y = new bfw(2, i + 36 - 19, j + 24 - 1, false));
/*     */     
/*  48 */     this.x.l = false;
/*  49 */     this.y.l = false;
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2)
/*     */   {
/*  54 */     this.q.b(this.A, this.f / 2 - this.q.a(this.A) / 2, 6, 4210752);
/*  55 */     this.q.b(brp.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  60 */     super.e();
/*     */     
/*  62 */     ago localago = this.w.b(this.k.h);
/*  63 */     if (localago != null) {
/*  64 */       this.x.l = (this.z < localago.size() - 1);
/*  65 */       this.y.l = (this.z > 0);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  71 */     int i = 0;
/*  72 */     if (parambcb == this.x) {
/*  73 */       this.z += 1;
/*  74 */       i = 1;
/*  75 */     } else if (parambcb == this.y) {
/*  76 */       this.z -= 1;
/*  77 */       i = 1;
/*     */     }
/*     */     
/*  80 */     if (i != 0) {
/*  81 */       ((aat)this.h).e(this.z);
/*     */       
/*  83 */       ByteBuf localByteBuf = Unpooled.buffer();
/*     */       try
/*     */       {
/*  86 */         localByteBuf.writeInt(this.z);
/*  87 */         this.k.v().a(new iz("MC|TrSel", localByteBuf));
/*     */       } catch (Exception localException) {
/*  89 */         u.error("Couldn't send trade info", localException);
/*     */       } finally {
/*  91 */         localByteBuf.release();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*     */   {
/*  98 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  99 */     this.k.P().a(v);
/* 100 */     int i = (this.l - this.f) / 2;
/* 101 */     int j = (this.m - this.g) / 2;
/* 102 */     b(i, j, 0, 0, this.f, this.g);
/*     */     
/* 104 */     ago localago = this.w.b(this.k.h);
/* 105 */     if ((localago != null) && (!localago.isEmpty()))
/*     */     {
/* 107 */       int k = this.z;
/* 108 */       agn localagn = (agn)localago.get(k);
/*     */       
/* 110 */       if (localagn.g()) {
/* 111 */         this.k.P().a(v);
/* 112 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 113 */         GL11.glDisable(2896);
/* 114 */         b(this.i + 83, this.r + 21, 212, 0, 28, 21);
/* 115 */         b(this.i + 83, this.r + 51, 212, 0, 28, 21);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 122 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */     
/*     */ 
/* 125 */     ago localago = this.w.b(this.k.h);
/* 126 */     if ((localago != null) && (!localago.isEmpty())) {
/* 127 */       int i = (this.l - this.f) / 2;
/* 128 */       int j = (this.m - this.g) / 2;
/*     */       
/* 130 */       int k = this.z;
/* 131 */       agn localagn = (agn)localago.get(k);
/*     */       
/* 133 */       GL11.glPushMatrix();
/*     */       
/* 135 */       add localadd1 = localagn.a();
/* 136 */       add localadd2 = localagn.b();
/* 137 */       add localadd3 = localagn.d();
/*     */       
/* 139 */       bam.c();
/* 140 */       GL11.glDisable(2896);
/* 141 */       GL11.glEnable(32826);
/* 142 */       GL11.glEnable(2903);
/* 143 */       GL11.glEnable(2896);
/*     */       
/* 145 */       j.f = 100.0F;
/* 146 */       j.b(this.q, this.k.P(), localadd1, i + 36, j + 24);
/* 147 */       j.c(this.q, this.k.P(), localadd1, i + 36, j + 24);
/*     */       
/* 149 */       if (localadd2 != null) {
/* 150 */         j.b(this.q, this.k.P(), localadd2, i + 62, j + 24);
/* 151 */         j.c(this.q, this.k.P(), localadd2, i + 62, j + 24);
/*     */       }
/*     */       
/* 154 */       j.b(this.q, this.k.P(), localadd3, i + 120, j + 24);
/* 155 */       j.c(this.q, this.k.P(), localadd3, i + 120, j + 24);
/* 156 */       j.f = 0.0F;
/*     */       
/* 158 */       GL11.glDisable(2896);
/*     */       
/* 160 */       if (c(36, 24, 16, 16, paramInt1, paramInt2)) {
/* 161 */         a(localadd1, paramInt1, paramInt2);
/* 162 */       } else if ((localadd2 != null) && (c(62, 24, 16, 16, paramInt1, paramInt2))) {
/* 163 */         a(localadd2, paramInt1, paramInt2);
/* 164 */       } else if (c(120, 24, 16, 16, paramInt1, paramInt2)) {
/* 165 */         a(localadd3, paramInt1, paramInt2);
/*     */       }
/*     */       
/* 168 */       GL11.glPopMatrix();
/*     */       
/* 170 */       GL11.glEnable(2896);
/* 171 */       GL11.glEnable(2929);
/* 172 */       bam.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public agm a() {
/* 177 */     return this.w;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */