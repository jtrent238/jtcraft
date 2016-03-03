/*    */ import java.io.BufferedInputStream;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.Map;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ import org.lwjgl.BufferUtils;
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
/*    */ public class bpl
/*    */ {
/*    */   private final bpm a;
/*    */   private final String b;
/*    */   private int c;
/* 24 */   private int d = 0;
/*    */   
/*    */   private bpl(bpm parambpm, int paramInt, String paramString) {
/* 27 */     this.a = parambpm;
/* 28 */     this.c = paramInt;
/* 29 */     this.b = paramString;
/*    */   }
/*    */   
/*    */   public void a(bpi parambpi) {
/* 33 */     this.d += 1;
/* 34 */     buu.b(parambpi.h(), this.c);
/*    */   }
/*    */   
/*    */   public void b(bpi parambpi) {
/* 38 */     this.d -= 1;
/*    */     
/* 40 */     if (this.d <= 0) {
/* 41 */       buu.a(this.c);
/* 42 */       this.a.d().remove(this.b);
/*    */     }
/*    */   }
/*    */   
/*    */   public String a() {
/* 47 */     return this.b;
/*    */   }
/*    */   
/*    */   public static bpl a(bqy parambqy, bpm parambpm, String paramString) {
/* 51 */     bpl localbpl = (bpl)parambpm.d().get(paramString);
/*    */     
/* 53 */     if (localbpl == null) {
/* 54 */       bqx localbqx = new bqx("shaders/program/" + paramString + parambpm.b());
/* 55 */       BufferedInputStream localBufferedInputStream = new BufferedInputStream(parambqy.a(localbqx).b());
/* 56 */       byte[] arrayOfByte = IOUtils.toByteArray(localBufferedInputStream);
/* 57 */       ByteBuffer localByteBuffer = BufferUtils.createByteBuffer(arrayOfByte.length);
/* 58 */       localByteBuffer.put(arrayOfByte);
/* 59 */       localByteBuffer.position(0);
/*    */       
/* 61 */       int i = buu.b(parambpm.c());
/* 62 */       buu.a(i, localByteBuffer);
/* 63 */       buu.c(i);
/*    */       
/* 65 */       if (buu.c(i, buu.p) == 0) {
/* 66 */         String str = StringUtils.trim(buu.d(i, 32768));
/* 67 */         lb locallb = new lb("Couldn't compile " + parambpm.a() + " program: " + str);
/* 68 */         locallb.b(localbqx.a());
/* 69 */         throw locallb;
/*    */       }
/*    */       
/* 72 */       localbpl = new bpl(parambpm, i, paramString);
/* 73 */       parambpm.d().put(paramString, localbpl);
/*    */     }
/*    */     
/* 76 */     return localbpl;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */