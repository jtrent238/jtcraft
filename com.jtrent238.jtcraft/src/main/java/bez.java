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
/*     */ public class bez
/*     */   extends bex
/*     */ {
/*  23 */   private static final Logger u = ;
/*     */   
/*     */ 
/*  26 */   private static final bqx v = new bqx("textures/gui/container/beacon.png");
/*     */   
/*     */   private aoq w;
/*     */   private bfb x;
/*     */   private boolean y;
/*     */   
/*     */   public bez(yx paramyx, aoq paramaoq)
/*     */   {
/*  34 */     super(new zx(paramyx, paramaoq));
/*  35 */     this.w = paramaoq;
/*     */     
/*  37 */     this.f = 230;
/*  38 */     this.g = 219;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  43 */     super.b();
/*     */     
/*  45 */     this.n.add(this.x = new bfb(this, -1, this.i + 164, this.r + 107));
/*  46 */     this.n.add(new bfa(this, -2, this.i + 190, this.r + 107));
/*     */     
/*  48 */     this.y = true;
/*     */     
/*  50 */     this.x.l = false;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  55 */     super.e();
/*     */     
/*  57 */     if ((this.y) && (this.w.l() >= 0)) {
/*  58 */       this.y = false;
/*     */       int n;
/*  60 */       bfc localbfc2; for (int i = 0; i <= 2; i++) {
/*  61 */         j = aoq.a[i].length;
/*  62 */         k = j * 22 + (j - 1) * 2;
/*     */         
/*  64 */         for (m = 0; m < j; m++) {
/*  65 */           n = aoq.a[i][m].H;
/*  66 */           localbfc2 = new bfc(this, i << 8 | n, this.i + 76 + m * 24 - k / 2, this.r + 22 + i * 25, n, i);
/*  67 */           this.n.add(localbfc2);
/*     */           
/*  69 */           if (i >= this.w.l()) {
/*  70 */             localbfc2.l = false;
/*  71 */           } else if (n == this.w.j()) {
/*  72 */             localbfc2.b(true);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  77 */       i = 3;
/*     */       
/*  79 */       int j = aoq.a[i].length + 1;
/*  80 */       int k = j * 22 + (j - 1) * 2;
/*     */       
/*  82 */       for (int m = 0; m < j - 1; m++) {
/*  83 */         n = aoq.a[i][m].H;
/*  84 */         localbfc2 = new bfc(this, i << 8 | n, this.i + 167 + m * 24 - k / 2, this.r + 47, n, i);
/*  85 */         this.n.add(localbfc2);
/*     */         
/*  87 */         if (i >= this.w.l()) {
/*  88 */           localbfc2.l = false;
/*  89 */         } else if (n == this.w.k()) {
/*  90 */           localbfc2.b(true);
/*     */         }
/*     */       }
/*  93 */       if (this.w.j() > 0) {
/*  94 */         bfc localbfc1 = new bfc(this, i << 8 | this.w.j(), this.i + 167 + (j - 1) * 24 - k / 2, this.r + 47, this.w.j(), i);
/*     */         
/*  96 */         this.n.add(localbfc1);
/*     */         
/*  98 */         if (i >= this.w.l()) {
/*  99 */           localbfc1.l = false;
/* 100 */         } else if (this.w.j() == this.w.k()) {
/* 101 */           localbfc1.b(true);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 106 */     this.x.l = ((this.w.a(0) != null) && (this.w.j() > 0));
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 111 */     if (parambcb.k == -2) {
/* 112 */       this.k.a(null);
/* 113 */     } else if (parambcb.k == -1) {
/* 114 */       String str = "MC|Beacon";
/*     */       
/* 116 */       ByteBuf localByteBuf = Unpooled.buffer();
/*     */       try
/*     */       {
/* 119 */         localByteBuf.writeInt(this.w.j());
/* 120 */         localByteBuf.writeInt(this.w.k());
/* 121 */         this.k.v().a(new iz(str, localByteBuf));
/*     */       } catch (Exception localException) {
/* 123 */         u.error("Couldn't send beacon info", localException);
/*     */       } finally {
/* 125 */         localByteBuf.release();
/*     */       }
/* 127 */       this.k.a(null);
/*     */     }
/* 129 */     else if ((parambcb instanceof bfc)) {
/* 130 */       if (((bfc)parambcb).d()) return;
/* 131 */       int i = parambcb.k;
/* 132 */       int j = i & 0xFF;
/* 133 */       int k = i >> 8;
/*     */       
/* 135 */       if (k < 3) {
/* 136 */         this.w.d(j);
/*     */       } else {
/* 138 */         this.w.e(j);
/*     */       }
/*     */       
/* 141 */       this.n.clear();
/* 142 */       b();
/* 143 */       e();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2)
/*     */   {
/* 149 */     bam.a();
/* 150 */     a(this.q, brp.a("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
/* 151 */     a(this.q, brp.a("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
/*     */     
/* 153 */     for (bcb localbcb : this.n) {
/* 154 */       if (localbcb.a()) {
/* 155 */         localbcb.b(paramInt1 - this.i, paramInt2 - this.r);
/* 156 */         break;
/*     */       }
/*     */     }
/* 159 */     bam.c();
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*     */   {
/* 164 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 165 */     this.k.P().a(v);
/* 166 */     int i = (this.l - this.f) / 2;
/* 167 */     int j = (this.m - this.g) / 2;
/* 168 */     b(i, j, 0, 0, this.f, this.g);
/*     */     
/* 170 */     j.f = 100.0F;
/* 171 */     j.b(this.q, this.k.P(), new add(ade.bC), i + 42, j + 109);
/* 172 */     j.b(this.q, this.k.P(), new add(ade.i), i + 42 + 22, j + 109);
/* 173 */     j.b(this.q, this.k.P(), new add(ade.k), i + 42 + 44, j + 109);
/* 174 */     j.b(this.q, this.k.P(), new add(ade.j), i + 42 + 66, j + 109);
/* 175 */     j.f = 0.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */