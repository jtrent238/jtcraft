/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.ByteBufInputStream;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import io.netty.handler.codec.base64.Base64;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.ScheduledThreadPoolExecutor;
/*     */ import java.util.concurrent.ThreadPoolExecutor;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public class bgc
/*     */   implements bci
/*     */ {
/*  33 */   private static final Logger a = ;
/*  34 */   private static final ThreadPoolExecutor b = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
/*     */   
/*     */   private final bfz c;
/*     */   
/*     */   private final bao d;
/*     */   private final bjn e;
/*     */   private long f;
/*     */   private String g;
/*     */   private bpq h;
/*     */   private bqx i;
/*     */   
/*     */   protected bgc(bfz parambfz, bjn parambjn)
/*     */   {
/*  47 */     this.c = parambfz;
/*  48 */     this.e = parambjn;
/*  49 */     this.d = bao.B();
/*  50 */     this.i = new bqx("servers/" + parambjn.b + "/icon");
/*  51 */     this.h = ((bpq)this.d.P().b(this.i));
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, bmh parambmh, int paramInt6, int paramInt7, boolean paramBoolean)
/*     */   {
/*  56 */     if (!this.e.h) {
/*  57 */       this.e.h = true;
/*  58 */       this.e.e = -2L;
/*  59 */       this.e.d = "";
/*  60 */       this.e.c = "";
/*     */       
/*  62 */       b.submit(new bgd(this));
/*     */     }
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
/*  78 */     int j = this.e.f > 5 ? 1 : 0;
/*  79 */     int k = this.e.f < 5 ? 1 : 0;
/*  80 */     int m = (j != 0) || (k != 0) ? 1 : 0;
/*     */     
/*  82 */     this.d.l.b(this.e.a, paramInt2 + 32 + 3, paramInt3 + 1, 16777215);
/*     */     
/*  84 */     List localList = this.d.l.c(this.e.d, paramInt4 - 32 - 2);
/*  85 */     for (int n = 0; n < Math.min(localList.size(), 2); n++) {
/*  86 */       this.d.l.b((String)localList.get(n), paramInt2 + 32 + 3, paramInt3 + 12 + this.d.l.a * n, 8421504);
/*     */     }
/*     */     
/*  89 */     String str1 = m != 0 ? a.e + this.e.g : this.e.c;
/*  90 */     int i1 = this.d.l.a(str1);
/*  91 */     this.d.l.b(str1, paramInt2 + paramInt4 - i1 - 15 - 2, paramInt3 + 1, 8421504);
/*     */     
/*     */ 
/*  94 */     int i2 = 0;
/*     */     
/*  96 */     String str2 = null;
/*     */     int i3;
/*     */     String str3;
/*  99 */     if (m != 0) {
/* 100 */       i3 = 5;
/* 101 */       str3 = j != 0 ? "Client out of date!" : "Server out of date!";
/* 102 */       str2 = this.e.i;
/* 103 */     } else if ((this.e.h) && (this.e.e != -2L)) {
/* 104 */       if (this.e.e < 0L) { i3 = 5;
/* 105 */       } else if (this.e.e < 150L) { i3 = 0;
/* 106 */       } else if (this.e.e < 300L) { i3 = 1;
/* 107 */       } else if (this.e.e < 600L) { i3 = 2;
/* 108 */       } else if (this.e.e < 1000L) i3 = 3; else {
/* 109 */         i3 = 4;
/*     */       }
/* 111 */       if (this.e.e < 0L) {
/* 112 */         str3 = "(no connection)";
/*     */       } else {
/* 114 */         str3 = this.e.e + "ms";
/* 115 */         str2 = this.e.i;
/*     */       }
/*     */     } else {
/* 118 */       i2 = 1;
/* 119 */       i3 = (int)(bao.K() / 100L + paramInt1 * 2 & 0x7);
/* 120 */       if (i3 > 4) i3 = 8 - i3;
/* 121 */       str3 = "Pinging...";
/*     */     }
/*     */     
/* 124 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 125 */     this.d.P().a(bbw.d);
/* 126 */     bbw.a(paramInt2 + paramInt4 - 15, paramInt3, i2 * 10, 176 + i3 * 8, 10, 8, 256.0F, 256.0F);
/*     */     
/* 128 */     if ((this.e.c() != null) && (!this.e.c().equals(this.g))) {
/* 129 */       this.g = this.e.c();
/* 130 */       b();
/* 131 */       this.c.h().b();
/*     */     }
/*     */     
/* 134 */     if (this.h != null) {
/* 135 */       this.d.P().a(this.i);
/* 136 */       bbw.a(paramInt2, paramInt3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
/*     */     }
/*     */     
/* 139 */     int i4 = paramInt6 - paramInt2;
/* 140 */     int i5 = paramInt7 - paramInt3;
/* 141 */     if ((i4 >= paramInt4 - 15) && (i4 <= paramInt4 - 5) && (i5 >= 0) && (i5 <= 8)) {
/* 142 */       this.c.a(str3);
/* 143 */     } else if ((i4 >= paramInt4 - i1 - 15 - 2) && (i4 <= paramInt4 - 15 - 2) && (i5 >= 0) && (i5 <= 8)) {
/* 144 */       this.c.a(str2);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 149 */     if (this.e.c() == null) {
/* 150 */       this.d.P().c(this.i);
/* 151 */       this.h = null;
/*     */     }
/*     */     else {
/* 154 */       ByteBuf localByteBuf1 = Unpooled.copiedBuffer(this.e.c(), Charsets.UTF_8);
/* 155 */       ByteBuf localByteBuf2 = Base64.decode(localByteBuf1);
/*     */       BufferedImage localBufferedImage;
/*     */       try {
/* 158 */         localBufferedImage = ImageIO.read(new ByteBufInputStream(localByteBuf2));
/* 159 */         Validate.validState(localBufferedImage.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
/* 160 */         Validate.validState(localBufferedImage.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
/*     */       } catch (Exception localException) {
/* 162 */         a.error("Invalid icon for server " + this.e.a + " (" + this.e.b + ")", localException);
/* 163 */         this.e.a(null); return;
/*     */       }
/*     */       finally {
/* 166 */         localByteBuf1.release();
/* 167 */         localByteBuf2.release();
/*     */       }
/*     */       
/* 170 */       if (this.h == null) {
/* 171 */         this.h = new bpq(localBufferedImage.getWidth(), localBufferedImage.getHeight());
/* 172 */         this.d.P().a(this.i, this.h);
/*     */       }
/*     */       
/* 175 */       localBufferedImage.getRGB(0, 0, localBufferedImage.getWidth(), localBufferedImage.getHeight(), this.h.d(), 0, localBufferedImage.getWidth());
/* 176 */       this.h.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 182 */     this.c.b(paramInt1);
/* 183 */     if (bao.K() - this.f < 250L) {
/* 184 */       this.c.f();
/*     */     }
/* 186 */     this.f = bao.K();
/* 187 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/*     */   
/*     */   public bjn a()
/*     */   {
/* 195 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */