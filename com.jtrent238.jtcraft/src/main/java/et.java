/*     */ import com.google.common.base.Charsets;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.ByteBufAllocator;
/*     */ import io.netty.buffer.ByteBufProcessor;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import java.nio.channels.GatheringByteChannel;
/*     */ import java.nio.channels.ScatteringByteChannel;
/*     */ import java.nio.charset.Charset;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class et
/*     */   extends ByteBuf
/*     */ {
/*     */   private final ByteBuf a;
/*     */   
/*     */   public et(ByteBuf paramByteBuf)
/*     */   {
/*  29 */     this.a = paramByteBuf;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt) {
/*  33 */     if ((paramInt & 0xFFFFFF80) == 0) return 1;
/*  34 */     if ((paramInt & 0xC000) == 0) return 2;
/*  35 */     if ((paramInt & 0xFFE00000) == 0) return 3;
/*  36 */     if ((paramInt & 0xF0000000) == 0) return 4;
/*  37 */     return 5;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int a()
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*     */     for (;;)
/*     */     {
/*  50 */       int k = readByte();
/*     */       
/*  52 */       i |= (k & 0x7F) << j++ * 7;
/*     */       
/*  54 */       if (j > 5) { throw new RuntimeException("VarInt too big");
/*     */       }
/*  56 */       if ((k & 0x80) != 128)
/*     */         break;
/*     */     }
/*  59 */     return i;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/*     */     for (;;) {
/*  64 */       if ((paramInt & 0xFFFFFF80) == 0) {
/*  65 */         writeByte(paramInt);
/*  66 */         return;
/*     */       }
/*     */       
/*  69 */       writeByte(paramInt & 0x7F | 0x80);
/*  70 */       paramInt >>>= 7;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dh paramdh) {
/*  75 */     if (paramdh == null) {
/*  76 */       writeShort(-1);
/*     */     } else {
/*  78 */       byte[] arrayOfByte = du.a(paramdh);
/*  79 */       writeShort((short)arrayOfByte.length);
/*  80 */       writeBytes(arrayOfByte);
/*     */     }
/*     */   }
/*     */   
/*     */   public dh b() {
/*  85 */     int i = readShort();
/*  86 */     if (i < 0) return null;
/*  87 */     byte[] arrayOfByte = new byte[i];
/*  88 */     readBytes(arrayOfByte);
/*  89 */     return du.a(arrayOfByte, new ds(2097152L));
/*     */   }
/*     */   
/*     */   public void a(add paramadd) {
/*  93 */     if (paramadd == null) {
/*  94 */       writeShort(-1);
/*     */     } else {
/*  96 */       writeShort(adb.b(paramadd.b()));
/*  97 */       writeByte(paramadd.b);
/*  98 */       writeShort(paramadd.k());
/*     */       
/* 100 */       dh localdh = null;
/* 101 */       if ((paramadd.b().p()) || (paramadd.b().s())) {
/* 102 */         localdh = paramadd.d;
/*     */       }
/* 104 */       a(localdh);
/*     */     }
/*     */   }
/*     */   
/*     */   public add c() {
/* 109 */     add localadd = null;
/* 110 */     int i = readShort();
/* 111 */     if (i >= 0) {
/* 112 */       int j = readByte();
/* 113 */       int k = readShort();
/*     */       
/* 115 */       localadd = new add(adb.d(i), j, k);
/* 116 */       localadd.d = b();
/*     */     }
/*     */     
/* 119 */     return localadd;
/*     */   }
/*     */   
/*     */   public String c(int paramInt) {
/* 123 */     int i = a();
/* 124 */     if (i > paramInt * 4) {
/* 125 */       throw new IOException("The received encoded string buffer length is longer than maximum allowed (" + i + " > " + paramInt * 4 + ")");
/*     */     }
/* 127 */     if (i < 0) {
/* 128 */       throw new IOException("The received encoded string buffer length is less than zero! Weird string!");
/*     */     }
/*     */     
/* 131 */     String str = new String(readBytes(i).array(), Charsets.UTF_8);
/*     */     
/* 133 */     if (str.length() > paramInt) {
/* 134 */       throw new IOException("The received string length is longer than maximum allowed (" + i + " > " + paramInt + ")");
/*     */     }
/*     */     
/* 137 */     return str;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 141 */     byte[] arrayOfByte = paramString.getBytes(Charsets.UTF_8);
/* 142 */     if (arrayOfByte.length > 32767) {
/* 143 */       throw new IOException("String too big (was " + paramString.length() + " bytes encoded, max " + 32767 + ")");
/*     */     }
/* 145 */     b(arrayOfByte.length);
/* 146 */     writeBytes(arrayOfByte);
/*     */   }
/*     */   
/*     */   public int capacity()
/*     */   {
/* 151 */     return this.a.capacity();
/*     */   }
/*     */   
/*     */   public ByteBuf capacity(int paramInt)
/*     */   {
/* 156 */     return this.a.capacity(paramInt);
/*     */   }
/*     */   
/*     */   public int maxCapacity()
/*     */   {
/* 161 */     return this.a.maxCapacity();
/*     */   }
/*     */   
/*     */   public ByteBufAllocator alloc()
/*     */   {
/* 166 */     return this.a.alloc();
/*     */   }
/*     */   
/*     */   public ByteOrder order()
/*     */   {
/* 171 */     return this.a.order();
/*     */   }
/*     */   
/*     */   public ByteBuf order(ByteOrder paramByteOrder)
/*     */   {
/* 176 */     return this.a.order(paramByteOrder);
/*     */   }
/*     */   
/*     */   public ByteBuf unwrap()
/*     */   {
/* 181 */     return this.a.unwrap();
/*     */   }
/*     */   
/*     */   public boolean isDirect()
/*     */   {
/* 186 */     return this.a.isDirect();
/*     */   }
/*     */   
/*     */   public int readerIndex()
/*     */   {
/* 191 */     return this.a.readerIndex();
/*     */   }
/*     */   
/*     */   public ByteBuf readerIndex(int paramInt)
/*     */   {
/* 196 */     return this.a.readerIndex(paramInt);
/*     */   }
/*     */   
/*     */   public int writerIndex()
/*     */   {
/* 201 */     return this.a.writerIndex();
/*     */   }
/*     */   
/*     */   public ByteBuf writerIndex(int paramInt)
/*     */   {
/* 206 */     return this.a.writerIndex(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf setIndex(int paramInt1, int paramInt2)
/*     */   {
/* 211 */     return this.a.setIndex(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int readableBytes()
/*     */   {
/* 216 */     return this.a.readableBytes();
/*     */   }
/*     */   
/*     */   public int writableBytes()
/*     */   {
/* 221 */     return this.a.writableBytes();
/*     */   }
/*     */   
/*     */   public int maxWritableBytes()
/*     */   {
/* 226 */     return this.a.maxWritableBytes();
/*     */   }
/*     */   
/*     */   public boolean isReadable()
/*     */   {
/* 231 */     return this.a.isReadable();
/*     */   }
/*     */   
/*     */   public boolean isReadable(int paramInt)
/*     */   {
/* 236 */     return this.a.isReadable(paramInt);
/*     */   }
/*     */   
/*     */   public boolean isWritable()
/*     */   {
/* 241 */     return this.a.isWritable();
/*     */   }
/*     */   
/*     */   public boolean isWritable(int paramInt)
/*     */   {
/* 246 */     return this.a.isWritable(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf clear()
/*     */   {
/* 251 */     return this.a.clear();
/*     */   }
/*     */   
/*     */   public ByteBuf markReaderIndex()
/*     */   {
/* 256 */     return this.a.markReaderIndex();
/*     */   }
/*     */   
/*     */   public ByteBuf resetReaderIndex()
/*     */   {
/* 261 */     return this.a.resetReaderIndex();
/*     */   }
/*     */   
/*     */   public ByteBuf markWriterIndex()
/*     */   {
/* 266 */     return this.a.markWriterIndex();
/*     */   }
/*     */   
/*     */   public ByteBuf resetWriterIndex()
/*     */   {
/* 271 */     return this.a.resetWriterIndex();
/*     */   }
/*     */   
/*     */   public ByteBuf discardReadBytes()
/*     */   {
/* 276 */     return this.a.discardReadBytes();
/*     */   }
/*     */   
/*     */   public ByteBuf discardSomeReadBytes()
/*     */   {
/* 281 */     return this.a.discardSomeReadBytes();
/*     */   }
/*     */   
/*     */   public ByteBuf ensureWritable(int paramInt)
/*     */   {
/* 286 */     return this.a.ensureWritable(paramInt);
/*     */   }
/*     */   
/*     */   public int ensureWritable(int paramInt, boolean paramBoolean)
/*     */   {
/* 291 */     return this.a.ensureWritable(paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean getBoolean(int paramInt)
/*     */   {
/* 296 */     return this.a.getBoolean(paramInt);
/*     */   }
/*     */   
/*     */   public byte getByte(int paramInt)
/*     */   {
/* 301 */     return this.a.getByte(paramInt);
/*     */   }
/*     */   
/*     */   public short getUnsignedByte(int paramInt)
/*     */   {
/* 306 */     return this.a.getUnsignedByte(paramInt);
/*     */   }
/*     */   
/*     */   public short getShort(int paramInt)
/*     */   {
/* 311 */     return this.a.getShort(paramInt);
/*     */   }
/*     */   
/*     */   public int getUnsignedShort(int paramInt)
/*     */   {
/* 316 */     return this.a.getUnsignedShort(paramInt);
/*     */   }
/*     */   
/*     */   public int getMedium(int paramInt)
/*     */   {
/* 321 */     return this.a.getMedium(paramInt);
/*     */   }
/*     */   
/*     */   public int getUnsignedMedium(int paramInt)
/*     */   {
/* 326 */     return this.a.getUnsignedMedium(paramInt);
/*     */   }
/*     */   
/*     */   public int getInt(int paramInt)
/*     */   {
/* 331 */     return this.a.getInt(paramInt);
/*     */   }
/*     */   
/*     */   public long getUnsignedInt(int paramInt)
/*     */   {
/* 336 */     return this.a.getUnsignedInt(paramInt);
/*     */   }
/*     */   
/*     */   public long getLong(int paramInt)
/*     */   {
/* 341 */     return this.a.getLong(paramInt);
/*     */   }
/*     */   
/*     */   public char getChar(int paramInt)
/*     */   {
/* 346 */     return this.a.getChar(paramInt);
/*     */   }
/*     */   
/*     */   public float getFloat(int paramInt)
/*     */   {
/* 351 */     return this.a.getFloat(paramInt);
/*     */   }
/*     */   
/*     */   public double getDouble(int paramInt)
/*     */   {
/* 356 */     return this.a.getDouble(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf getBytes(int paramInt, ByteBuf paramByteBuf)
/*     */   {
/* 361 */     return this.a.getBytes(paramInt, paramByteBuf);
/*     */   }
/*     */   
/*     */   public ByteBuf getBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2)
/*     */   {
/* 366 */     return this.a.getBytes(paramInt1, paramByteBuf, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf getBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2, int paramInt3)
/*     */   {
/* 371 */     return this.a.getBytes(paramInt1, paramByteBuf, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public ByteBuf getBytes(int paramInt, byte[] paramArrayOfByte)
/*     */   {
/* 376 */     return this.a.getBytes(paramInt, paramArrayOfByte);
/*     */   }
/*     */   
/*     */   public ByteBuf getBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
/*     */   {
/* 381 */     return this.a.getBytes(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public ByteBuf getBytes(int paramInt, ByteBuffer paramByteBuffer)
/*     */   {
/* 386 */     return this.a.getBytes(paramInt, paramByteBuffer);
/*     */   }
/*     */   
/*     */   public ByteBuf getBytes(int paramInt1, OutputStream paramOutputStream, int paramInt2)
/*     */   {
/* 391 */     return this.a.getBytes(paramInt1, paramOutputStream, paramInt2);
/*     */   }
/*     */   
/*     */   public int getBytes(int paramInt1, GatheringByteChannel paramGatheringByteChannel, int paramInt2)
/*     */   {
/* 396 */     return this.a.getBytes(paramInt1, paramGatheringByteChannel, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setBoolean(int paramInt, boolean paramBoolean)
/*     */   {
/* 401 */     return this.a.setBoolean(paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */   public ByteBuf setByte(int paramInt1, int paramInt2)
/*     */   {
/* 406 */     return this.a.setByte(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setShort(int paramInt1, int paramInt2)
/*     */   {
/* 411 */     return this.a.setShort(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setMedium(int paramInt1, int paramInt2)
/*     */   {
/* 416 */     return this.a.setMedium(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setInt(int paramInt1, int paramInt2)
/*     */   {
/* 421 */     return this.a.setInt(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setLong(int paramInt, long paramLong)
/*     */   {
/* 426 */     return this.a.setLong(paramInt, paramLong);
/*     */   }
/*     */   
/*     */   public ByteBuf setChar(int paramInt1, int paramInt2)
/*     */   {
/* 431 */     return this.a.setChar(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setFloat(int paramInt, float paramFloat)
/*     */   {
/* 436 */     return this.a.setFloat(paramInt, paramFloat);
/*     */   }
/*     */   
/*     */   public ByteBuf setDouble(int paramInt, double paramDouble)
/*     */   {
/* 441 */     return this.a.setDouble(paramInt, paramDouble);
/*     */   }
/*     */   
/*     */   public ByteBuf setBytes(int paramInt, ByteBuf paramByteBuf)
/*     */   {
/* 446 */     return this.a.setBytes(paramInt, paramByteBuf);
/*     */   }
/*     */   
/*     */   public ByteBuf setBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2)
/*     */   {
/* 451 */     return this.a.setBytes(paramInt1, paramByteBuf, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2, int paramInt3)
/*     */   {
/* 456 */     return this.a.setBytes(paramInt1, paramByteBuf, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public ByteBuf setBytes(int paramInt, byte[] paramArrayOfByte)
/*     */   {
/* 461 */     return this.a.setBytes(paramInt, paramArrayOfByte);
/*     */   }
/*     */   
/*     */   public ByteBuf setBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
/*     */   {
/* 466 */     return this.a.setBytes(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public ByteBuf setBytes(int paramInt, ByteBuffer paramByteBuffer)
/*     */   {
/* 471 */     return this.a.setBytes(paramInt, paramByteBuffer);
/*     */   }
/*     */   
/*     */   public int setBytes(int paramInt1, InputStream paramInputStream, int paramInt2)
/*     */   {
/* 476 */     return this.a.setBytes(paramInt1, paramInputStream, paramInt2);
/*     */   }
/*     */   
/*     */   public int setBytes(int paramInt1, ScatteringByteChannel paramScatteringByteChannel, int paramInt2)
/*     */   {
/* 481 */     return this.a.setBytes(paramInt1, paramScatteringByteChannel, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf setZero(int paramInt1, int paramInt2)
/*     */   {
/* 486 */     return this.a.setZero(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public boolean readBoolean()
/*     */   {
/* 491 */     return this.a.readBoolean();
/*     */   }
/*     */   
/*     */   public byte readByte()
/*     */   {
/* 496 */     return this.a.readByte();
/*     */   }
/*     */   
/*     */   public short readUnsignedByte()
/*     */   {
/* 501 */     return this.a.readUnsignedByte();
/*     */   }
/*     */   
/*     */   public short readShort()
/*     */   {
/* 506 */     return this.a.readShort();
/*     */   }
/*     */   
/*     */   public int readUnsignedShort()
/*     */   {
/* 511 */     return this.a.readUnsignedShort();
/*     */   }
/*     */   
/*     */   public int readMedium()
/*     */   {
/* 516 */     return this.a.readMedium();
/*     */   }
/*     */   
/*     */   public int readUnsignedMedium()
/*     */   {
/* 521 */     return this.a.readUnsignedMedium();
/*     */   }
/*     */   
/*     */   public int readInt()
/*     */   {
/* 526 */     return this.a.readInt();
/*     */   }
/*     */   
/*     */   public long readUnsignedInt()
/*     */   {
/* 531 */     return this.a.readUnsignedInt();
/*     */   }
/*     */   
/*     */   public long readLong()
/*     */   {
/* 536 */     return this.a.readLong();
/*     */   }
/*     */   
/*     */   public char readChar()
/*     */   {
/* 541 */     return this.a.readChar();
/*     */   }
/*     */   
/*     */   public float readFloat()
/*     */   {
/* 546 */     return this.a.readFloat();
/*     */   }
/*     */   
/*     */   public double readDouble()
/*     */   {
/* 551 */     return this.a.readDouble();
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(int paramInt)
/*     */   {
/* 556 */     return this.a.readBytes(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf readSlice(int paramInt)
/*     */   {
/* 561 */     return this.a.readSlice(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(ByteBuf paramByteBuf)
/*     */   {
/* 566 */     return this.a.readBytes(paramByteBuf);
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(ByteBuf paramByteBuf, int paramInt)
/*     */   {
/* 571 */     return this.a.readBytes(paramByteBuf, paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(ByteBuf paramByteBuf, int paramInt1, int paramInt2)
/*     */   {
/* 576 */     return this.a.readBytes(paramByteBuf, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(byte[] paramArrayOfByte)
/*     */   {
/* 581 */     return this.a.readBytes(paramArrayOfByte);
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 586 */     return this.a.readBytes(paramArrayOfByte, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(ByteBuffer paramByteBuffer)
/*     */   {
/* 591 */     return this.a.readBytes(paramByteBuffer);
/*     */   }
/*     */   
/*     */   public ByteBuf readBytes(OutputStream paramOutputStream, int paramInt)
/*     */   {
/* 596 */     return this.a.readBytes(paramOutputStream, paramInt);
/*     */   }
/*     */   
/*     */   public int readBytes(GatheringByteChannel paramGatheringByteChannel, int paramInt)
/*     */   {
/* 601 */     return this.a.readBytes(paramGatheringByteChannel, paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf skipBytes(int paramInt)
/*     */   {
/* 606 */     return this.a.skipBytes(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeBoolean(boolean paramBoolean)
/*     */   {
/* 611 */     return this.a.writeBoolean(paramBoolean);
/*     */   }
/*     */   
/*     */   public ByteBuf writeByte(int paramInt)
/*     */   {
/* 616 */     return this.a.writeByte(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeShort(int paramInt)
/*     */   {
/* 621 */     return this.a.writeShort(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeMedium(int paramInt)
/*     */   {
/* 626 */     return this.a.writeMedium(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeInt(int paramInt)
/*     */   {
/* 631 */     return this.a.writeInt(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeLong(long paramLong)
/*     */   {
/* 636 */     return this.a.writeLong(paramLong);
/*     */   }
/*     */   
/*     */   public ByteBuf writeChar(int paramInt)
/*     */   {
/* 641 */     return this.a.writeChar(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeFloat(float paramFloat)
/*     */   {
/* 646 */     return this.a.writeFloat(paramFloat);
/*     */   }
/*     */   
/*     */   public ByteBuf writeDouble(double paramDouble)
/*     */   {
/* 651 */     return this.a.writeDouble(paramDouble);
/*     */   }
/*     */   
/*     */   public ByteBuf writeBytes(ByteBuf paramByteBuf)
/*     */   {
/* 656 */     return this.a.writeBytes(paramByteBuf);
/*     */   }
/*     */   
/*     */   public ByteBuf writeBytes(ByteBuf paramByteBuf, int paramInt)
/*     */   {
/* 661 */     return this.a.writeBytes(paramByteBuf, paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeBytes(ByteBuf paramByteBuf, int paramInt1, int paramInt2)
/*     */   {
/* 666 */     return this.a.writeBytes(paramByteBuf, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf writeBytes(byte[] paramArrayOfByte)
/*     */   {
/* 671 */     return this.a.writeBytes(paramArrayOfByte);
/*     */   }
/*     */   
/*     */   public ByteBuf writeBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 676 */     return this.a.writeBytes(paramArrayOfByte, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf writeBytes(ByteBuffer paramByteBuffer)
/*     */   {
/* 681 */     return this.a.writeBytes(paramByteBuffer);
/*     */   }
/*     */   
/*     */   public int writeBytes(InputStream paramInputStream, int paramInt)
/*     */   {
/* 686 */     return this.a.writeBytes(paramInputStream, paramInt);
/*     */   }
/*     */   
/*     */   public int writeBytes(ScatteringByteChannel paramScatteringByteChannel, int paramInt)
/*     */   {
/* 691 */     return this.a.writeBytes(paramScatteringByteChannel, paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf writeZero(int paramInt)
/*     */   {
/* 696 */     return this.a.writeZero(paramInt);
/*     */   }
/*     */   
/*     */   public int indexOf(int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/* 701 */     return this.a.indexOf(paramInt1, paramInt2, paramByte);
/*     */   }
/*     */   
/*     */   public int bytesBefore(byte paramByte)
/*     */   {
/* 706 */     return this.a.bytesBefore(paramByte);
/*     */   }
/*     */   
/*     */   public int bytesBefore(int paramInt, byte paramByte)
/*     */   {
/* 711 */     return this.a.bytesBefore(paramInt, paramByte);
/*     */   }
/*     */   
/*     */   public int bytesBefore(int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/* 716 */     return this.a.bytesBefore(paramInt1, paramInt2, paramByte);
/*     */   }
/*     */   
/*     */   public int forEachByte(ByteBufProcessor paramByteBufProcessor)
/*     */   {
/* 721 */     return this.a.forEachByte(paramByteBufProcessor);
/*     */   }
/*     */   
/*     */   public int forEachByte(int paramInt1, int paramInt2, ByteBufProcessor paramByteBufProcessor)
/*     */   {
/* 726 */     return this.a.forEachByte(paramInt1, paramInt2, paramByteBufProcessor);
/*     */   }
/*     */   
/*     */   public int forEachByteDesc(ByteBufProcessor paramByteBufProcessor)
/*     */   {
/* 731 */     return this.a.forEachByteDesc(paramByteBufProcessor);
/*     */   }
/*     */   
/*     */   public int forEachByteDesc(int paramInt1, int paramInt2, ByteBufProcessor paramByteBufProcessor)
/*     */   {
/* 736 */     return this.a.forEachByteDesc(paramInt1, paramInt2, paramByteBufProcessor);
/*     */   }
/*     */   
/*     */   public ByteBuf copy()
/*     */   {
/* 741 */     return this.a.copy();
/*     */   }
/*     */   
/*     */   public ByteBuf copy(int paramInt1, int paramInt2)
/*     */   {
/* 746 */     return this.a.copy(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf slice()
/*     */   {
/* 751 */     return this.a.slice();
/*     */   }
/*     */   
/*     */   public ByteBuf slice(int paramInt1, int paramInt2)
/*     */   {
/* 756 */     return this.a.slice(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuf duplicate()
/*     */   {
/* 761 */     return this.a.duplicate();
/*     */   }
/*     */   
/*     */   public int nioBufferCount()
/*     */   {
/* 766 */     return this.a.nioBufferCount();
/*     */   }
/*     */   
/*     */   public ByteBuffer nioBuffer()
/*     */   {
/* 771 */     return this.a.nioBuffer();
/*     */   }
/*     */   
/*     */   public ByteBuffer nioBuffer(int paramInt1, int paramInt2)
/*     */   {
/* 776 */     return this.a.nioBuffer(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuffer internalNioBuffer(int paramInt1, int paramInt2)
/*     */   {
/* 781 */     return this.a.internalNioBuffer(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public ByteBuffer[] nioBuffers()
/*     */   {
/* 786 */     return this.a.nioBuffers();
/*     */   }
/*     */   
/*     */   public ByteBuffer[] nioBuffers(int paramInt1, int paramInt2)
/*     */   {
/* 791 */     return this.a.nioBuffers(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public boolean hasArray()
/*     */   {
/* 796 */     return this.a.hasArray();
/*     */   }
/*     */   
/*     */   public byte[] array()
/*     */   {
/* 801 */     return this.a.array();
/*     */   }
/*     */   
/*     */   public int arrayOffset()
/*     */   {
/* 806 */     return this.a.arrayOffset();
/*     */   }
/*     */   
/*     */   public boolean hasMemoryAddress()
/*     */   {
/* 811 */     return this.a.hasMemoryAddress();
/*     */   }
/*     */   
/*     */   public long memoryAddress()
/*     */   {
/* 816 */     return this.a.memoryAddress();
/*     */   }
/*     */   
/*     */   public String toString(Charset paramCharset)
/*     */   {
/* 821 */     return this.a.toString(paramCharset);
/*     */   }
/*     */   
/*     */   public String toString(int paramInt1, int paramInt2, Charset paramCharset)
/*     */   {
/* 826 */     return this.a.toString(paramInt1, paramInt2, paramCharset);
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 831 */     return this.a.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 836 */     return this.a.equals(paramObject);
/*     */   }
/*     */   
/*     */   public int compareTo(ByteBuf paramByteBuf)
/*     */   {
/* 841 */     return this.a.compareTo(paramByteBuf);
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 846 */     return this.a.toString();
/*     */   }
/*     */   
/*     */   public ByteBuf retain(int paramInt)
/*     */   {
/* 851 */     return this.a.retain(paramInt);
/*     */   }
/*     */   
/*     */   public ByteBuf retain()
/*     */   {
/* 856 */     return this.a.retain();
/*     */   }
/*     */   
/*     */   public int refCnt()
/*     */   {
/* 861 */     return this.a.refCnt();
/*     */   }
/*     */   
/*     */   public boolean release()
/*     */   {
/* 866 */     return this.a.release();
/*     */   }
/*     */   
/*     */   public boolean release(int paramInt)
/*     */   {
/* 871 */     return this.a.release(paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */